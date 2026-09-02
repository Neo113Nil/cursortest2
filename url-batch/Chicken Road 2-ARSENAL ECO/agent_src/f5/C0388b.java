package f5;

import a4.d;
import a4.e;
import java.util.Objects;
import java.util.function.BiConsumer;

/* renamed from: f5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0388b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        boolean z5 = false;
        if (!eVar.f3140b.isEmpty()) {
            String str = eVar.f3140b;
            if (str.length() <= 255) {
                int i7 = 0;
                while (true) {
                    if (i7 >= str.length()) {
                        z5 = true;
                        break;
                    }
                    char charAt = str.charAt(i7);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        d.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z5);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
