package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v4.os.EnvironmentCompat;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tapjoy.TJAdUnitConstants;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aa extends b {

    /* renamed from: c, reason: collision with root package name */
    private final ab f4892c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.ads.internal.n.i f4893d;
    private boolean e;
    private boolean f;
    private boolean g;
    private View h;
    private List<View> i;

    public aa(Context context, c cVar, com.facebook.ads.internal.r.a aVar, ab abVar) {
        super(context, cVar, aVar);
        this.f4892c = abVar;
    }

    private String b(View view) {
        try {
            return c(view).toString();
        } catch (JSONException unused) {
            return "Json exception";
        }
    }

    private JSONObject c(View view) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("id", Integer.valueOf(view.getId()));
        jSONObject.putOpt("class", view.getClass());
        jSONObject.putOpt("origin", String.format("{x:%d, y:%d}", Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())));
        jSONObject.putOpt("size", String.format("{h:%d, w:%d}", Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())));
        jSONObject.putOpt(TJAdUnitConstants.String.CLICKABLE, Boolean.valueOf(this.i != null && this.i.contains(view)));
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        if (view instanceof Button) {
            str = "button";
        } else if (view instanceof TextView) {
            str = "text";
        } else if (view instanceof ImageView) {
            str = "image";
        } else if (view instanceof MediaView) {
            str = "mediaview";
        } else if (view instanceof ViewGroup) {
            str = "viewgroup";
        }
        jSONObject.putOpt("type", str);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                jSONArray.put(c(viewGroup.getChildAt(i)));
            }
            jSONObject.putOpt("list", jSONArray);
        }
        return jSONObject;
    }

    private String d(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return "";
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, this.f4892c.i(), byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Exception unused) {
            return "";
        }
    }

    public void a(View view) {
        this.h = view;
    }

    public void a(com.facebook.ads.internal.n.i iVar) {
        this.f4893d = iVar;
    }

    public void a(List<View> list) {
        this.i = list;
    }

    @Override // com.facebook.ads.internal.adapters.b
    protected void a(Map<String, String> map) {
        if (this.f4892c == null) {
            return;
        }
        if (this.f4906a != null) {
            map.put("mil", String.valueOf(this.f4906a.c()));
            map.put("eil", String.valueOf(this.f4906a.d()));
            map.put("eil_source", this.f4906a.e());
        }
        if (this.f4893d != null) {
            map.put("nti", String.valueOf(this.f4893d.c()));
        }
        if (this.e) {
            map.put("nhs", Boolean.TRUE.toString());
        }
        if (this.f) {
            map.put("nmv", Boolean.TRUE.toString());
        }
        if (this.g) {
            map.put("nmvap", Boolean.TRUE.toString());
        }
        if (this.h != null && this.f4892c.f()) {
            map.put(Promotion.ACTION_VIEW, b(this.h));
        }
        if (this.h != null && this.f4892c.e()) {
            map.put("snapshot", d(this.h));
        }
        this.f4892c.a(map);
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public void c(boolean z) {
        this.g = z;
    }
}
