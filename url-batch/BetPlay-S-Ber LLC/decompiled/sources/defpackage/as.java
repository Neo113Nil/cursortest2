package defpackage;

import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.awerser.monnit.betplay.MainActivity2;
import com.awerser.monnit.betplay.R;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class as implements gm, Serializable {
    public transient as f;
    public final MainActivity2 g;
    public final String h;
    public final String i;
    public final boolean j = false;
    public final int k = 0;
    public final /* synthetic */ int l;

    public as(MainActivity2 mainActivity2, String str, String str2, int i) {
        this.l = i;
        this.g = mainActivity2;
        this.h = str;
        this.i = str2;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [zr] */
    @Override // defpackage.gm
    public final Object a(Object obj) {
        en copy$default;
        int i = this.l;
        final MainActivity2 mainActivity2 = this.g;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                ArrayList arrayList = mainActivity2.I;
                if (intValue >= 0 && intValue < arrayList.size()) {
                    en enVar = (en) arrayList.get(intValue);
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
                    format.getClass();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(6, -1);
                    String format2 = simpleDateFormat.format(calendar.getTime());
                    if (enVar.isCompletedToday()) {
                        copy$default = en.copy$default(enVar, null, null, null, Math.max(0, enVar.getStreak() - 1), "", 0L, 39, null);
                    } else {
                        copy$default = en.copy$default(enVar, null, null, null, op.d(enVar.getLastCompletedDate(), format2) ? 1 + enVar.getStreak() : 1, format, 0L, 39, null);
                    }
                    arrayList.set(intValue, copy$default);
                    in inVar = mainActivity2.H;
                    if (inVar == null) {
                        op.T("adapter");
                        throw null;
                    }
                    inVar.a.b(intValue);
                    j1 j1Var = mainActivity2.G;
                    if (j1Var == null) {
                        op.T("repository");
                        throw null;
                    }
                    j1Var.y(arrayList);
                    mainActivity2.s();
                }
                return vg.m;
            default:
                final int intValue2 = ((Number) obj).intValue();
                ArrayList arrayList2 = mainActivity2.I;
                if (intValue2 >= 0 && intValue2 < arrayList2.size()) {
                    String name = ((en) arrayList2.get(intValue2)).getName();
                    cs csVar = new cs(mainActivity2);
                    r2 r2Var = (r2) csVar.b;
                    ContextThemeWrapper contextThemeWrapper = r2Var.a;
                    r2Var.d = contextThemeWrapper.getText(R.string.remove_habit);
                    r2Var.f = mainActivity2.getString(R.string.remove_confirm_message, name);
                    ?? r0 = new DialogInterface.OnClickListener() { // from class: zr
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            MainActivity2 mainActivity22 = MainActivity2.this;
                            ArrayList arrayList3 = mainActivity22.I;
                            int i3 = intValue2;
                            arrayList3.remove(i3);
                            in inVar2 = mainActivity22.H;
                            if (inVar2 == null) {
                                op.T("adapter");
                                throw null;
                            }
                            inVar2.a.d(i3);
                            j1 j1Var2 = mainActivity22.G;
                            if (j1Var2 == null) {
                                op.T("repository");
                                throw null;
                            }
                            j1Var2.y(arrayList3);
                            mainActivity22.r();
                        }
                    };
                    r2Var.g = contextThemeWrapper.getText(R.string.remove);
                    r2Var.h = r0;
                    r2Var.i = contextThemeWrapper.getText(R.string.cancel);
                    csVar.a().show();
                }
                return vg.m;
        }
    }

    public final pa b() {
        if (this.j) {
            g00.a.getClass();
            return new zw();
        }
        g00.a.getClass();
        return new qa(MainActivity2.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as) {
            as asVar = (as) obj;
            if (this.h.equals(asVar.h) && this.i.equals(asVar.i) && this.k == asVar.k && this.g == asVar.g && b().equals(asVar.b())) {
                return true;
            }
        } else if (obj instanceof as) {
            as asVar2 = this.f;
            if (asVar2 == null) {
                g00.a.getClass();
                this.f = this;
            } else {
                this = asVar2;
            }
            return obj.equals(this);
        }
        return false;
    }

    public final int hashCode() {
        b();
        return this.i.hashCode() + ((this.h.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        as asVar = this.f;
        if (asVar == null) {
            g00.a.getClass();
            this.f = this;
            asVar = this;
        }
        if (asVar != this) {
            return asVar.toString();
        }
        String str = this.h;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }
}
