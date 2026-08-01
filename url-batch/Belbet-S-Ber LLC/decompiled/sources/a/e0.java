package a;

import android.os.Bundle;
import com.gdmhkmf.belbet.R;
import java.time.LocalDate;
import java.time.ZoneOffset;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements h3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17g;

    public /* synthetic */ e0(int i, Object obj) {
        this.f16f = i;
        this.f17g = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (r2.compareTo(r4) <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        if (r2.compareTo(r4) <= 0) goto L15;
     */
    @Override // h3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        com.google.android.material.datepicker.x xVar;
        switch (this.f16f) {
            case 0:
                return new h0((j0) this.f17g);
            default:
                a4.h hVar = (a4.h) this.f17g;
                g.i iVar = (g.i) hVar.f175a;
                LocalDate localDate = (LocalDate) hVar.f179f;
                if (localDate == null) {
                    localDate = LocalDate.now().minusYears(25L);
                }
                com.google.android.material.datepicker.a aVar = new com.google.android.material.datepicker.a();
                aVar.f1027a = com.google.android.material.datepicker.a.f1025f;
                aVar.f1028b = com.google.android.material.datepicker.a.f1026g;
                aVar.f1030e = new com.google.android.material.datepicker.g(Long.MIN_VALUE);
                aVar.f1028b = System.currentTimeMillis();
                com.google.android.material.datepicker.b a5 = aVar.a();
                com.google.android.material.datepicker.x xVar2 = a5.f1034g;
                com.google.android.material.datepicker.x xVar3 = a5.f1033f;
                com.google.android.material.datepicker.f0 f0Var = new com.google.android.material.datepicker.f0();
                String string = iVar.getString(R.string.field_date);
                i3.d.b(localDate);
                f0Var.f1067f = Long.valueOf(com.google.android.material.datepicker.i0.a(localDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli()));
                if (a5.i == null) {
                    if (!f0Var.a().isEmpty()) {
                        xVar = com.google.android.material.datepicker.x.c(((Long) f0Var.a().iterator().next()).longValue());
                        if (xVar.compareTo(xVar3) >= 0) {
                            break;
                        }
                    }
                    xVar = new com.google.android.material.datepicker.x(com.google.android.material.datepicker.i0.d());
                    if (xVar.compareTo(xVar3) >= 0) {
                        break;
                    }
                    a5.i = xVar3;
                }
                com.google.android.material.datepicker.v vVar = new com.google.android.material.datepicker.v();
                Bundle bundle = new Bundle();
                bundle.putInt("OVERRIDE_THEME_RES_ID", R.style.Theme_Win_MaterialDatePicker);
                bundle.putParcelable("DATE_SELECTOR_KEY", f0Var);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", a5);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putInt("TITLE_TEXT_RES_ID_KEY", R.string.mtrl_picker_date_header_title);
                bundle.putCharSequence("TITLE_TEXT_KEY", string);
                bundle.putInt("INPUT_MODE_KEY", 0);
                bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
                bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
                bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
                bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
                bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
                bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
                bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
                vVar.F(bundle);
                vVar.f1108o0.add(new o1.g(new g0(1, hVar)));
                androidx.fragment.app.k0 k0Var = ((androidx.fragment.app.w) iVar.f1527z.f79g).f676r;
                vVar.f615l0 = false;
                vVar.f616m0 = true;
                k0Var.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(k0Var);
                aVar2.f504o = true;
                aVar2.e(0, vVar, "birthday_date_picker", 1);
                aVar2.d(false);
                return w2.d.f3820c;
        }
    }
}
