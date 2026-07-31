package z2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.sw;

/* loaded from: classes.dex */
public final class t extends FrameLayout implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final ImageButton f23683f;

    /* renamed from: g, reason: collision with root package name */
    private final b f23684g;

    public t(Context context, s sVar, b bVar) {
        super(context);
        this.f23684g = bVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f23683f = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        qw.b();
        int s7 = bo0.s(context, sVar.f23679a);
        qw.b();
        int s8 = bo0.s(context, 0);
        qw.b();
        int s9 = bo0.s(context, sVar.f23680b);
        qw.b();
        imageButton.setPadding(s7, s8, s9, bo0.s(context, sVar.f23681c));
        imageButton.setContentDescription("Interstitial close button");
        qw.b();
        int s10 = bo0.s(context, sVar.f23682d + sVar.f23679a + sVar.f23680b);
        qw.b();
        addView(imageButton, new FrameLayout.LayoutParams(s10, bo0.s(context, sVar.f23682d + sVar.f23681c), 17));
        long longValue = ((Long) sw.c().b(m10.Q0)).longValue();
        if (longValue <= 0) {
            return;
        }
        r rVar = ((Boolean) sw.c().b(m10.R0)).booleanValue() ? new r(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(rVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        int i7;
        String str = (String) sw.c().b(m10.P0);
        if (!v3.l.g() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f23683f.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources d7 = y2.t.p().d();
        if (d7 == null) {
            this.f23683f.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
        } catch (Resources.NotFoundException unused) {
            io0.b("Close button resource not found, falling back to default.");
        }
        if (!"white".equals(str)) {
            if ("black".equals(str)) {
                i7 = w2.a.f22998a;
            }
            ImageButton imageButton = this.f23683f;
            if (drawable != null) {
                imageButton.setImageResource(R.drawable.btn_dialog);
                return;
            } else {
                imageButton.setImageDrawable(drawable);
                this.f23683f.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
        }
        i7 = w2.a.f22999b;
        drawable = d7.getDrawable(i7);
        ImageButton imageButton2 = this.f23683f;
        if (drawable != null) {
        }
    }

    public final void b(boolean z6) {
        if (!z6) {
            this.f23683f.setVisibility(0);
            return;
        }
        this.f23683f.setVisibility(8);
        if (((Long) sw.c().b(m10.Q0)).longValue() > 0) {
            this.f23683f.animate().cancel();
            this.f23683f.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f23684g;
        if (bVar != null) {
            bVar.O0();
        }
    }
}
