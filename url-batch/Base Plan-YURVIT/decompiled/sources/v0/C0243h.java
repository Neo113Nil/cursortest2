package v0;

import androidx.datastore.preferences.protobuf.k0;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243h implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0243h f3087a = new C0243h();

    @Override // v0.j
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object K2 = k0.K(obj);
        if (K2 instanceof String) {
            p pVar = p.f3094b;
            String quote = JSONObject.quote((String) K2);
            pVar.getClass();
            return p.d(quote);
        }
        p pVar2 = p.f3094b;
        String obj2 = K2.toString();
        pVar2.getClass();
        return p.d(obj2);
    }

    @Override // v0.j
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            p.f3094b.getClass();
            JSONTokener jSONTokener = new JSONTokener(p.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }
}
