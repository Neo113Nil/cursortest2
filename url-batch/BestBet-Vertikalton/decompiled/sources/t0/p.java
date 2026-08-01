package t0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fortunequest.neontrack.DefeatActivity;
import com.fortunequest.neontrack.R;
import com.fortunequest.neontrack.RulesActivity;
import com.fortunequest.neontrack.VictoryActivity;
import com.google.android.material.button.MaterialButton;
import g.AbstractActivityC0128i;
import j1.InterfaceC0170a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements InterfaceC0170a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f4150b;

    public /* synthetic */ p(AbstractActivityC0128i abstractActivityC0128i, int i) {
        this.f4149a = i;
        this.f4150b = abstractActivityC0128i;
    }

    @Override // j1.InterfaceC0170a
    public final Object c() {
        AbstractActivityC0128i abstractActivityC0128i = this.f4150b;
        switch (this.f4149a) {
            case 0:
                int i = DefeatActivity.f2078z;
                View inflate = ((DefeatActivity) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_defeat, (ViewGroup) null, false);
                int i2 = R.id.btnDefeatFresh;
                MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.btnDefeatFresh);
                if (materialButton != null) {
                    i2 = R.id.btnDefeatHome;
                    MaterialButton materialButton2 = (MaterialButton) b1.g.l(inflate, R.id.btnDefeatHome);
                    if (materialButton2 != null) {
                        return new v0.c((FrameLayout) inflate, materialButton, materialButton2);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            case 1:
                int i3 = RulesActivity.f2090z;
                View inflate2 = ((RulesActivity) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                MaterialButton materialButton3 = (MaterialButton) b1.g.l(inflate2, R.id.btnRulesBack);
                if (materialButton3 != null) {
                    return new v0.f((FrameLayout) inflate2, materialButton3);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.btnRulesBack)));
            default:
                int i4 = VictoryActivity.f2092z;
                View inflate3 = ((VictoryActivity) abstractActivityC0128i).getLayoutInflater().inflate(R.layout.activity_victory, (ViewGroup) null, false);
                int i5 = R.id.btnVictoryContinue;
                MaterialButton materialButton4 = (MaterialButton) b1.g.l(inflate3, R.id.btnVictoryContinue);
                if (materialButton4 != null) {
                    i5 = R.id.victoryLevel;
                    TextView textView = (TextView) b1.g.l(inflate3, R.id.victoryLevel);
                    if (textView != null) {
                        i5 = R.id.victoryMultiplier;
                        TextView textView2 = (TextView) b1.g.l(inflate3, R.id.victoryMultiplier);
                        if (textView2 != null) {
                            i5 = R.id.victoryStreak;
                            TextView textView3 = (TextView) b1.g.l(inflate3, R.id.victoryStreak);
                            if (textView3 != null) {
                                return new v0.g((FrameLayout) inflate3, materialButton4, textView, textView2, textView3);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i5)));
        }
    }
}
