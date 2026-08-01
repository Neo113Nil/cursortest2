package o0;

import a1.InterfaceC0058a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.glasspulse.glasspulse.HomeActivity;
import com.glasspulse.glasspulse.MainActivity2;
import com.glasspulse.glasspulse.R;
import com.glasspulse.glasspulse.RulesActivity;
import g.AbstractActivityC0128i;
import k0.z;
import q0.C0275a;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0262e implements InterfaceC0058a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f3374b;

    public /* synthetic */ C0262e(AbstractActivityC0128i abstractActivityC0128i, int i) {
        this.f3373a = i;
        this.f3374b = abstractActivityC0128i;
    }

    @Override // a1.InterfaceC0058a
    public final Object a() {
        AbstractActivityC0128i abstractActivityC0128i = this.f3374b;
        switch (this.f3373a) {
            case 0:
                int i = HomeActivity.f1602z;
                View inflate = ((HomeActivity) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                int i2 = R.id.btnChooseGoal;
                Button button = (Button) z.g(inflate, R.id.btnChooseGoal);
                if (button != null) {
                    i2 = R.id.btnRules;
                    Button button2 = (Button) z.g(inflate, R.id.btnRules);
                    if (button2 != null) {
                        i2 = R.id.btnTrackWater;
                        Button button3 = (Button) z.g(inflate, R.id.btnTrackWater);
                        if (button3 != null) {
                            i2 = R.id.homeSubtitle;
                            if (((TextView) z.g(inflate, R.id.homeSubtitle)) != null) {
                                i2 = R.id.homeTitle;
                                if (((TextView) z.g(inflate, R.id.homeTitle)) != null) {
                                    return new C0275a((FrameLayout) inflate, button, button2, button3);
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 1:
                int i3 = MainActivity2.f1611z;
                View inflate2 = ((MainActivity2) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
                if (inflate2 != null) {
                    return new q0.c((FrameLayout) inflate2);
                }
                throw new NullPointerException("rootView");
            default:
                int i4 = RulesActivity.f1613z;
                View inflate3 = ((RulesActivity) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                int i5 = R.id.btnBack;
                Button button4 = (Button) z.g(inflate3, R.id.btnBack);
                if (button4 != null) {
                    i5 = R.id.rulesBody;
                    if (((TextView) z.g(inflate3, R.id.rulesBody)) != null) {
                        i5 = R.id.rulesTitle;
                        if (((TextView) z.g(inflate3, R.id.rulesTitle)) != null) {
                            return new q0.e((FrameLayout) inflate3, button4);
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i5)));
        }
    }
}
