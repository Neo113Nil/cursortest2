package O0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.neonpulse.gridlogic.R;
import com.neonpulse.gridlogic.ResultActivity;
import com.neonpulse.gridlogic.RulesActivity;
import d1.InterfaceC0081a;
import g.AbstractActivityC0132i;
import j0.AbstractC0142a;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0081a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f691b;

    public /* synthetic */ k(AbstractActivityC0132i abstractActivityC0132i, int i) {
        this.f690a = i;
        this.f691b = abstractActivityC0132i;
    }

    @Override // d1.InterfaceC0081a
    public final Object a() {
        AbstractActivityC0132i abstractActivityC0132i = this.f691b;
        switch (this.f690a) {
            case 0:
                int i = ResultActivity.f1986z;
                View inflate = ((ResultActivity) abstractActivityC0132i).getLayoutInflater().inflate(R.layout.activity_result, (ViewGroup) null, false);
                int i2 = R.id.btnHome;
                Button button = (Button) AbstractC0142a.f(inflate, R.id.btnHome);
                if (button != null) {
                    i2 = R.id.btnNext;
                    Button button2 = (Button) AbstractC0142a.f(inflate, R.id.btnNext);
                    if (button2 != null) {
                        i2 = R.id.btnPlayAgain;
                        Button button3 = (Button) AbstractC0142a.f(inflate, R.id.btnPlayAgain);
                        if (button3 != null) {
                            i2 = R.id.resultMessage;
                            TextView textView = (TextView) AbstractC0142a.f(inflate, R.id.resultMessage);
                            if (textView != null) {
                                i2 = R.id.resultOutcome;
                                TextView textView2 = (TextView) AbstractC0142a.f(inflate, R.id.resultOutcome);
                                if (textView2 != null) {
                                    i2 = R.id.resultScore;
                                    TextView textView3 = (TextView) AbstractC0142a.f(inflate, R.id.resultScore);
                                    if (textView3 != null) {
                                        return new R0.e((FrameLayout) inflate, button, button2, button3, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            default:
                int i3 = RulesActivity.f1988z;
                View inflate2 = ((RulesActivity) abstractActivityC0132i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                Button button4 = (Button) AbstractC0142a.f(inflate2, R.id.btnBackRules);
                if (button4 != null) {
                    return new R0.f((FrameLayout) inflate2, button4);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(R.id.btnBackRules)));
        }
    }
}
