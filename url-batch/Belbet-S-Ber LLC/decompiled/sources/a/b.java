package a;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import com.gdmhkmf.belbet.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2g;
    public final /* synthetic */ Object h;

    public /* synthetic */ b(Object obj, Object obj2, int i) {
        this.f1f = i;
        this.f2g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1f;
        Object obj = this.h;
        Object obj2 = this.f2g;
        switch (i) {
            case 0:
                g.i iVar = (g.i) obj2;
                iVar.f871f.a(new d((j0) obj, iVar));
                return;
            case 1:
                com.google.android.material.datepicker.e0 e0Var = (com.google.android.material.datepicker.e0) obj2;
                TextInputLayout textInputLayout = e0Var.f1057f;
                SimpleDateFormat simpleDateFormat = e0Var.h;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(R.string.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', (char) 160)) + "\n" + String.format(context.getString(R.string.mtrl_picker_invalid_format_example), simpleDateFormat.format(new Date(com.google.android.material.datepicker.i0.d().getTimeInMillis())).replace(' ', (char) 160)));
                com.google.android.material.datepicker.f0 f0Var = e0Var.f1065p;
                e0Var.f1064o.getError();
                f0Var.getClass();
                e0Var.f1063n.a();
                return;
            case 2:
                ((e0.b) obj2).h((Typeface) obj);
                return;
            case 3:
                g.m mVar = (g.m) obj2;
                Runnable runnable = (Runnable) obj;
                mVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    mVar.a();
                }
            default:
                MaterialButton materialButton = (MaterialButton) obj2;
                int[] iArr = MaterialButton.S;
                ((Runnable) obj).run();
                LinearLayout.LayoutParams layoutParams = materialButton.H;
                if (layoutParams != null) {
                    materialButton.setLayoutParams(layoutParams);
                    materialButton.H = null;
                    materialButton.E = -2.1474836E9f;
                }
                materialButton.requestLayout();
                return;
        }
    }
}
