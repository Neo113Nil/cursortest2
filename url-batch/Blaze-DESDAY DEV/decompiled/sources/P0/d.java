package P0;

import R0.f;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winworm.neongrid.MainActivity2;
import com.winworm.neongrid.R;
import com.winworm.neongrid.ui.ResultActivity;
import com.winworm.neongrid.ui.RulesActivity;
import f1.InterfaceC0090a;
import g.AbstractActivityC0108i;
import i0.g;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0090a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f705b;

    public /* synthetic */ d(AbstractActivityC0108i abstractActivityC0108i, int i) {
        this.f704a = i;
        this.f705b = abstractActivityC0108i;
    }

    @Override // f1.InterfaceC0090a
    public final Object b() {
        AbstractActivityC0108i abstractActivityC0108i = this.f705b;
        switch (this.f704a) {
            case 0:
                int i = MainActivity2.f2028z;
                View inflate = ((MainActivity2) abstractActivityC0108i).getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
                if (inflate != null) {
                    return new R0.d((FrameLayout) inflate);
                }
                throw new NullPointerException("rootView");
            case 1:
                int i2 = ResultActivity.f2058z;
                View inflate2 = ((ResultActivity) abstractActivityC0108i).getLayoutInflater().inflate(R.layout.activity_result, (ViewGroup) null, false);
                int i3 = R.id.homeButton;
                MaterialButton materialButton = (MaterialButton) g.h(inflate2, R.id.homeButton);
                if (materialButton != null) {
                    i3 = R.id.nextLevelButton;
                    MaterialButton materialButton2 = (MaterialButton) g.h(inflate2, R.id.nextLevelButton);
                    if (materialButton2 != null) {
                        i3 = R.id.resultFood;
                        TextView textView = (TextView) g.h(inflate2, R.id.resultFood);
                        if (textView != null) {
                            i3 = R.id.resultMessage;
                            TextView textView2 = (TextView) g.h(inflate2, R.id.resultMessage);
                            if (textView2 != null) {
                                i3 = R.id.resultScore;
                                TextView textView3 = (TextView) g.h(inflate2, R.id.resultScore);
                                if (textView3 != null) {
                                    i3 = R.id.resultTitle;
                                    TextView textView4 = (TextView) g.h(inflate2, R.id.resultTitle);
                                    if (textView4 != null) {
                                        i3 = R.id.retryButton;
                                        MaterialButton materialButton3 = (MaterialButton) g.h(inflate2, R.id.retryButton);
                                        if (materialButton3 != null) {
                                            return new f((ConstraintLayout) inflate2, materialButton, materialButton2, textView, textView2, textView3, textView4, materialButton3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
            default:
                int i4 = RulesActivity.f2060z;
                View inflate3 = ((RulesActivity) abstractActivityC0108i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                MaterialButton materialButton4 = (MaterialButton) g.h(inflate3, R.id.backButton);
                if (materialButton4 != null) {
                    return new R0.g((ScrollView) inflate3, materialButton4);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.backButton)));
        }
    }
}
