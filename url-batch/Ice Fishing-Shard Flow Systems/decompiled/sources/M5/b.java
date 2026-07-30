package M5;

import H4.d;
import H4.e;
import java.util.Objects;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        e eVar = (e) obj;
        boolean z7 = false;
        if (!eVar.f991b.isEmpty()) {
            String str = eVar.f991b;
            if (str.length() <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= str.length()) {
                        z7 = true;
                        break;
                    }
                    char charAt = str.charAt(i2);
                    if (charAt < ' ' || charAt > '~') {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        d.a("Attribute key should be a ASCII string with a length greater than 0 and not exceed 255 characters.", z7);
        Objects.requireNonNull(obj2, "Attribute value should be a ASCII string with a length not exceed 255 characters.");
    }
}
