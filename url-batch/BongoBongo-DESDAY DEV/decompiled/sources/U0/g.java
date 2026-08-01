package U0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.winfour.winrandom.R;
import com.winfour.winrandom.ui.HomeActivity;
import com.winfour.winrandom.ui.PresetsActivity;
import com.winfour.winrandom.ui.RulesActivity;
import g.AbstractActivityC0106i;
import g1.InterfaceC0110a;
import h.AbstractC0112a;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC0110a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f882b;

    public /* synthetic */ g(AbstractActivityC0106i abstractActivityC0106i, int i) {
        this.f881a = i;
        this.f882b = abstractActivityC0106i;
    }

    @Override // g1.InterfaceC0110a
    public final Object b() {
        int i = R.id.btnBack;
        AbstractActivityC0106i abstractActivityC0106i = this.f882b;
        switch (this.f881a) {
            case 0:
                int i2 = HomeActivity.f2113z;
                View inflate = ((HomeActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_home, (ViewGroup) null, false);
                int i3 = R.id.btnGenerate;
                MaterialButton materialButton = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnGenerate);
                if (materialButton != null) {
                    i3 = R.id.btnHistory;
                    MaterialButton materialButton2 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnHistory);
                    if (materialButton2 != null) {
                        i3 = R.id.btnPresets;
                        MaterialButton materialButton3 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnPresets);
                        if (materialButton3 != null) {
                            i3 = R.id.btnRules;
                            MaterialButton materialButton4 = (MaterialButton) AbstractC0112a.h(inflate, R.id.btnRules);
                            if (materialButton4 != null) {
                                return new S0.c((ScrollView) inflate, materialButton, materialButton2, materialButton3, materialButton4);
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
            case 1:
                int i4 = PresetsActivity.f2115z;
                View inflate2 = ((PresetsActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_presets, (ViewGroup) null, false);
                MaterialButton materialButton5 = (MaterialButton) AbstractC0112a.h(inflate2, R.id.btnBack);
                if (materialButton5 != null) {
                    i = R.id.btnCoin;
                    MaterialButton materialButton6 = (MaterialButton) AbstractC0112a.h(inflate2, R.id.btnCoin);
                    if (materialButton6 != null) {
                        i = R.id.btnCustom;
                        MaterialButton materialButton7 = (MaterialButton) AbstractC0112a.h(inflate2, R.id.btnCustom);
                        if (materialButton7 != null) {
                            i = R.id.btnDice;
                            MaterialButton materialButton8 = (MaterialButton) AbstractC0112a.h(inflate2, R.id.btnDice);
                            if (materialButton8 != null) {
                                i = R.id.btnLottery;
                                MaterialButton materialButton9 = (MaterialButton) AbstractC0112a.h(inflate2, R.id.btnLottery);
                                if (materialButton9 != null) {
                                    return new S0.e((LinearLayout) inflate2, materialButton5, materialButton6, materialButton7, materialButton8, materialButton9);
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i)));
            default:
                int i5 = RulesActivity.f2126z;
                View inflate3 = ((RulesActivity) abstractActivityC0106i).getLayoutInflater().inflate(R.layout.activity_rules, (ViewGroup) null, false);
                MaterialButton materialButton10 = (MaterialButton) AbstractC0112a.h(inflate3, R.id.btnBack);
                if (materialButton10 != null) {
                    return new S0.f((LinearLayout) inflate3, materialButton10);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.btnBack)));
        }
    }
}
