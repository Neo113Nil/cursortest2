package T0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.winpower.neonfit.MainActivity;
import com.winpower.neonfit.MainActivity2;
import com.winpower.neonfit.R;
import com.winpower.neonfit.TargetCrashActivity;
import h.AbstractActivityC0132i;
import i1.InterfaceC0181a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC0181a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f1180b;

    public /* synthetic */ m(AbstractActivityC0132i abstractActivityC0132i, int i) {
        this.f1179a = i;
        this.f1180b = abstractActivityC0132i;
    }

    @Override // i1.InterfaceC0181a
    public final Object c() {
        AbstractActivityC0132i abstractActivityC0132i = this.f1180b;
        switch (this.f1179a) {
            case 0:
                int i = MainActivity.f2602D;
                View inflate = ((MainActivity) abstractActivityC0132i).getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                if (inflate != null) {
                    return new U0.e((ConstraintLayout) inflate);
                }
                throw new NullPointerException("rootView");
            case 1:
                int i2 = MainActivity2.f2608z;
                View inflate2 = ((MainActivity2) abstractActivityC0132i).getLayoutInflater().inflate(R.layout.activity_main2, (ViewGroup) null, false);
                int i3 = R.id.btnOpenDashboard;
                MaterialButton materialButton = (MaterialButton) H1.d.z(inflate2, R.id.btnOpenDashboard);
                if (materialButton != null) {
                    i3 = R.id.btnSettings;
                    MaterialButton materialButton2 = (MaterialButton) H1.d.z(inflate2, R.id.btnSettings);
                    if (materialButton2 != null) {
                        return new U0.d((FrameLayout) inflate2, materialButton, materialButton2);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
            default:
                int i4 = TargetCrashActivity.f2613z;
                View inflate3 = ((TargetCrashActivity) abstractActivityC0132i).getLayoutInflater().inflate(R.layout.activity_target_crash, (ViewGroup) null, false);
                MaterialButton materialButton3 = (MaterialButton) H1.d.z(inflate3, R.id.btnContinue);
                if (materialButton3 != null) {
                    return new U0.g((FrameLayout) inflate3, materialButton3);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.btnContinue)));
        }
    }
}
