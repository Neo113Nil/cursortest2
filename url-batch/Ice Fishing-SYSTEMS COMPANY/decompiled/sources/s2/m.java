package s2;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.Yr;
import com.icefishing.icefishingliveapp.C5284R;
import q2.C4907p;
import q2.r;
import t2.C;

/* loaded from: classes.dex */
public final class m extends FrameLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final ImageButton f40486n;

    /* renamed from: u, reason: collision with root package name */
    public final BinderC4996d f40487u;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(Context context, Yr yr, BinderC4996d binderC4996d) {
        super(context);
        Drawable drawable;
        this.f40487u = binderC4996d;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f40486n = imageButton;
        String str = (String) r.f40116e.f40119c.a(AbstractC3368ia.f31466J1);
        if (TextUtils.isEmpty(str) || com.anythink.core.express.b.a.f17688f.equals(str)) {
            imageButton.setImageResource(R.drawable.btn_dialog);
        } else {
            Resources c4 = p2.j.f39798C.f39808h.c();
            if (c4 != null) {
                try {
                } catch (Resources.NotFoundException unused) {
                    int i = C.f40822b;
                    u2.i.a("Close button resource not found, falling back to default.");
                    drawable = null;
                }
                if ("white".equals(str)) {
                    drawable = c4.getDrawable(C5284R.drawable.admob_close_button_white_circle_black_cross);
                } else {
                    if ("black".equals(str)) {
                        drawable = c4.getDrawable(C5284R.drawable.admob_close_button_black_circle_white_cross);
                    }
                    drawable = null;
                }
                if (drawable == null) {
                    imageButton.setImageResource(R.drawable.btn_dialog);
                } else {
                    imageButton.setImageDrawable(drawable);
                    imageButton.setScaleType(ImageView.ScaleType.CENTER);
                }
            } else {
                imageButton.setImageResource(R.drawable.btn_dialog);
            }
        }
        this.f40486n.setBackgroundColor(0);
        this.f40486n.setOnClickListener(this);
        ImageButton imageButton2 = this.f40486n;
        u2.d dVar = C4907p.f40108g.f40109a;
        imageButton2.setPadding(u2.d.b(context, yr.f28896a), u2.d.q(context.getResources().getDisplayMetrics(), 0), u2.d.q(context.getResources().getDisplayMetrics(), yr.f28897b), u2.d.q(context.getResources().getDisplayMetrics(), yr.f28898c));
        this.f40486n.setContentDescription("Interstitial close button");
        addView(this.f40486n, new FrameLayout.LayoutParams(u2.d.q(context.getResources().getDisplayMetrics(), yr.f28899d + yr.f28896a + yr.f28897b), u2.d.q(context.getResources().getDisplayMetrics(), yr.f28899d + yr.f28898c), 17));
        C3151ea c3151ea = AbstractC3368ia.f31475K1;
        r rVar = r.f40116e;
        long longValue = ((Long) rVar.f40119c.a(c3151ea)).longValue();
        if (longValue <= 0) {
            return;
        }
        D0.k kVar = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31484L1)).booleanValue() ? new D0.k(this) : null;
        this.f40486n.setAlpha(0.0f);
        this.f40486n.animate().alpha(1.0f).setDuration(longValue).setListener(kVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BinderC4996d binderC4996d = this.f40487u;
        if (binderC4996d != null) {
            binderC4996d.f40453Q = 2;
            binderC4996d.f40455u.finish();
        }
    }
}
