package j4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.IntroActivity;

/* loaded from: classes2.dex */
public final class e extends G0.a {

    /* renamed from: a, reason: collision with root package name */
    public IntroActivity f38565a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f38566b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f38567c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f38568d;

    @Override // G0.a
    public final void a(ViewPager viewPager, Object obj) {
        viewPager.removeView((View) obj);
    }

    @Override // G0.a
    public final int b() {
        return this.f38566b.length;
    }

    @Override // G0.a
    public final View c(ViewPager viewPager, int i) {
        View inflate = ((LayoutInflater) this.f38565a.getSystemService("layout_inflater")).inflate(C5284R.layout.item_slide_layout, (ViewGroup) viewPager, false);
        ((ImageView) inflate.findViewById(C5284R.id.im_LogoSlide)).setImageResource(this.f38566b[i]);
        ((TextView) inflate.findViewById(C5284R.id.textTitle)).setText(this.f38567c[i]);
        ((TextView) inflate.findViewById(C5284R.id.textDes)).setText(this.f38568d[i]);
        viewPager.addView(inflate);
        return inflate;
    }

    @Override // G0.a
    public final boolean d(View view, Object obj) {
        return view == obj;
    }
}
