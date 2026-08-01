package o1;

import android.text.Editable;
import android.view.View;
import com.gdmhkmf.belbet.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.time.LocalDate;
import java.util.UUID;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2886g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(Object obj, Object obj2, int i) {
        this.f2885f = i;
        this.f2886g = obj;
        this.h = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar;
        String obj;
        String obj2;
        switch (this.f2885f) {
            case 0:
                ((c) this.f2886g).f2889e.b((h) this.h);
                break;
            case 1:
                ((c) this.f2886g).f2890f.b((h) this.h);
                break;
            default:
                a4.h hVar2 = (a4.h) this.f2886g;
                g.f fVar = (g.f) this.h;
                g.i iVar = (g.i) hVar2.f175a;
                p1.c cVar = (p1.c) hVar2.d;
                TextInputEditText textInputEditText = cVar.f3069e;
                TextInputLayout textInputLayout = cVar.f3071g;
                TextInputLayout textInputLayout2 = cVar.h;
                Editable text = textInputEditText.getText();
                String str = null;
                String obj3 = (text == null || (obj2 = text.toString()) == null) ? null : p3.d.E0(obj2).toString();
                if (obj3 == null) {
                    obj3 = "";
                }
                if (obj3.length() != 0) {
                    textInputLayout2.setError(null);
                    LocalDate localDate = (LocalDate) hVar2.f179f;
                    if (localDate != null) {
                        textInputLayout.setError(null);
                        Editable text2 = cVar.f3070f.getText();
                        if (text2 != null && (obj = text2.toString()) != null) {
                            str = p3.d.E0(obj).toString();
                        }
                        String str2 = str != null ? str : "";
                        h hVar3 = (h) hVar2.f176b;
                        if (hVar3 != null) {
                            String str3 = hVar3.f2898a;
                            i3.d.e(str3, "id");
                            hVar = new h(str3, obj3, localDate, str2);
                        } else {
                            hVar = new h(UUID.randomUUID().toString(), obj3, localDate, str2);
                        }
                        ((h3.l) hVar2.f177c).b(hVar);
                        fVar.dismiss();
                        break;
                    } else {
                        textInputLayout.setError(iVar.getString(R.string.error_date_empty));
                        break;
                    }
                } else {
                    textInputLayout2.setError(iVar.getString(R.string.error_name_empty));
                    break;
                }
                break;
        }
    }
}
