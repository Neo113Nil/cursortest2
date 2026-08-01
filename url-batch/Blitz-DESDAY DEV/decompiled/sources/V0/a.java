package V0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winfour.neondrop.R;
import com.winfour.neondrop.game.ConnectFourView;
import com.winfour.neondrop.ui.GameActivity;
import com.winfour.neondrop.ui.RulesActivity;
import f1.InterfaceC0099a;
import g.AbstractActivityC0110i;
import m.C0227a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0099a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f925b;

    public /* synthetic */ a(AbstractActivityC0110i abstractActivityC0110i, int i) {
        this.f924a = i;
        this.f925b = abstractActivityC0110i;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        int i = R.id.topBar;
        AbstractActivityC0110i abstractActivityC0110i = this.f925b;
        switch (this.f924a) {
            case 0:
                int i2 = GameActivity.f2101G;
                View inflate = ((GameActivity) abstractActivityC0110i).getLayoutInflater().inflate(R.layout.activity_game, (ViewGroup) null, false);
                int i3 = R.id.boardView;
                ConnectFourView connectFourView = (ConnectFourView) C0227a.g(inflate, R.id.boardView);
                if (connectFourView != null) {
                    i3 = R.id.levelText;
                    TextView textView = (TextView) C0227a.g(inflate, R.id.levelText);
                    if (textView != null) {
                        i3 = R.id.livesText;
                        TextView textView2 = (TextView) C0227a.g(inflate, R.id.livesText);
                        if (textView2 != null) {
                            i3 = R.id.quitButton;
                            MaterialButton materialButton = (MaterialButton) C0227a.g(inflate, R.id.quitButton);
                            if (materialButton != null) {
                                i3 = R.id.scoreText;
                                TextView textView3 = (TextView) C0227a.g(inflate, R.id.scoreText);
                                if (textView3 != null) {
                                    if (((LinearLayout) C0227a.g(inflate, R.id.topBar)) != null) {
                                        return new T0.a((ConstraintLayout) inflate, connectFourView, textView, textView2, materialButton, textView3);
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                                }
                            }
                        }
                    }
                }
                i = i3;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            default:
                int i4 = RulesActivity.f2119z;
                View inflate2 = ((RulesActivity) abstractActivityC0110i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                int i5 = R.id.backButton;
                MaterialButton materialButton2 = (MaterialButton) C0227a.g(inflate2, R.id.backButton);
                if (materialButton2 != null) {
                    i5 = R.id.rulesText;
                    if (((TextView) C0227a.g(inflate2, R.id.rulesText)) != null) {
                        if (((LinearLayout) C0227a.g(inflate2, R.id.topBar)) != null) {
                            return new T0.f((ConstraintLayout) inflate2, materialButton2);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
                    }
                }
                i = i5;
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
        }
    }
}
