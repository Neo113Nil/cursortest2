package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private final String f21783n;

    /* renamed from: o, reason: collision with root package name */
    private View f21784o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f21785p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f21786q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f21787r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f21788s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f21789t;

    /* renamed from: u, reason: collision with root package name */
    private b f21790u;

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.f21783n = "AnythinkVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f21785p = (ImageView) view.findViewById(findID("anythink_vec_iv_icon"));
            this.f21786q = (ImageView) view.findViewById(findID("anythink_vec_iv_close"));
            this.f21787r = (TextView) view.findViewById(findID("anythink_vec_tv_title"));
            this.f21788s = (TextView) view.findViewById(findID("anythink_vec_tv_desc"));
            this.f21789t = (TextView) view.findViewById(findID("anythink_vec_btn"));
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void b() {
        View view = this.f21784o;
        if (view == null) {
            init(this.f21599a);
            preLoadData(this.f21790u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f21784o.getParent()).removeView(this.f21784o);
        }
        addView(this.f21784o);
        a(this.f21784o);
        c();
    }

    private void e() {
        ImageView imageView;
        d dVar = this.f21600b;
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.bl()) && (imageView = this.f21785p) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bl(), new j(imageView, i.e(8.0f)));
            }
            TextView textView = this.f21787r;
            if (textView != null) {
                textView.setText(this.f21600b.bj());
            }
            TextView textView2 = this.f21789t;
            if (textView2 != null) {
                textView2.setText(this.f21600b.dj);
            }
            TextView textView3 = this.f21788s;
            if (textView3 != null) {
                textView3.setText(this.f21600b.bk());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        this.f21786q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar = AnythinkVideoEndCoverView.this.f21603e;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            }
        });
        this.f21785p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
        this.f21789t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout("anythink_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f21601c.inflate(findLayout, (ViewGroup) null);
            this.f21784o = inflate;
            if (inflate != null) {
                this.f21604f = a(inflate);
                addView(this.f21784o, -1, -1);
                c();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f21605g = motionEvent.getRawX();
        this.f21606h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f21602d = configuration.orientation;
        removeView(this.f21784o);
        View view = this.f21784o;
        if (view == null) {
            init(this.f21599a);
            preLoadData(this.f21790u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f21784o.getParent()).removeView(this.f21784o);
        }
        addView(this.f21784o);
        a(this.f21784o);
        c();
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f21790u = bVar;
        try {
            d dVar = this.f21600b;
            if (dVar == null || !this.f21604f || dVar == null) {
                return;
            }
            if (!TextUtils.isEmpty(dVar.bl()) && (imageView = this.f21785p) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.f21599a.getApplicationContext()).a(this.f21600b.bl(), new j(imageView, v.b(t.b().g(), 8.0f)));
            }
            TextView textView = this.f21787r;
            if (textView != null) {
                textView.setText(this.f21600b.bj());
            }
            TextView textView2 = this.f21789t;
            if (textView2 != null) {
                textView2.setText(this.f21600b.dj);
            }
            TextView textView3 = this.f21788s;
            if (textView3 != null) {
                textView3.setText(this.f21600b.bk());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21783n = "AnythinkVideoEndCoverView";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        JSONObject jSONObject;
        JSONException e6;
        a aVar;
        JSONObject jSONObject2;
        JSONException e9;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, v.a(t.b().g(), this.f21605g));
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, v.a(t.b().g(), this.f21606h));
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cj, 0);
                    try {
                        this.f21602d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.ck, this.f21602d);
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                } catch (JSONException e11) {
                    e9 = e11;
                    e9.getMessage();
                    jSONObject = new JSONObject();
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ci, jSONObject2);
                    aVar = this.f21603e;
                    if (aVar != null) {
                    }
                }
            } catch (JSONException e12) {
                jSONObject2 = jSONObject3;
                e9 = e12;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, jSONObject2);
            } catch (JSONException e13) {
                e6 = e13;
                e6.printStackTrace();
                aVar = this.f21603e;
                if (aVar != null) {
                }
            }
        } catch (JSONException e14) {
            jSONObject = null;
            e6 = e14;
        }
        aVar = this.f21603e;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }
}
