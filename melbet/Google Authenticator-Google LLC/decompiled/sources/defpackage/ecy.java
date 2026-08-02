package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.authenticator2.R;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ecy {
    public final boolean a;
    private final her b;
    private final her c;

    public ecy(boolean z, her herVar, her herVar2) {
        this.a = z;
        this.b = herVar;
        this.c = herVar2;
    }

    public static ecy b(Context context) {
        boolean c = c(context);
        her d = d(context);
        hen henVar = new hen(4);
        for (ecw ecwVar : ecw.values()) {
            henVar.g(ecwVar, Integer.valueOf(context.getColor(c ? ecwVar.e : ecwVar.f)));
        }
        return new ecy(c, d, henVar.d(true));
    }

    public static boolean c(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    private static her d(Context context) {
        ecx[] values = ecx.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = values[i].g;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(ecx.class);
        for (int i2 = 0; i2 < values.length; i2++) {
            try {
                try {
                    ecx ecxVar = values[i2];
                    enumMap.put((EnumMap) ecxVar, (ecx) Integer.valueOf(obtainStyledAttributes.getColor(i2, context.getResources().getColor(ecxVar.h))));
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        Iterator it = enumMap.entrySet().iterator();
        if (!it.hasNext()) {
            return hix.b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        hnu.ao(r1, value);
        EnumMap enumMap2 = new EnumMap(Collections.singletonMap(r1, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            hnu.ao(r12, value2);
            enumMap2.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap2.size();
        if (size == 0) {
            return hix.b;
        }
        if (size != 1) {
            return new hed(enumMap2);
        }
        Map.Entry entry3 = (Map.Entry) hnu.X(enumMap2.entrySet());
        return her.j((Enum) entry3.getKey(), entry3.getValue());
    }

    public final int a(ecw ecwVar) {
        Integer num = (Integer) this.c.get(ecwVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecy) {
            ecy ecyVar = (ecy) obj;
            if (this.a == ecyVar.a && this.b.equals(ecyVar.b) && hnu.B(this.c, ecyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        her herVar = this.c;
        return "OneGoogleColorResolver{isLightTheme=" + this.a + ", colorsMap=" + this.b.toString() + ", googleThemedColorsMap=" + herVar.toString() + "}";
    }

    public ecy() {
        throw null;
    }
}
