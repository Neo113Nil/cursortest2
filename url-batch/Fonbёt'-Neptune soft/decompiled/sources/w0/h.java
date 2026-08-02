package w0;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3555a = new h();

    @Override // w0.k
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            q.f3566b.getClass();
            JSONTokener jSONTokener = new JSONTokener(q.c(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // w0.k
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object d2 = j.d(obj);
        if (d2 instanceof String) {
            q qVar = q.f3566b;
            String quote = JSONObject.quote((String) d2);
            qVar.getClass();
            return q.d(quote);
        }
        q qVar2 = q.f3566b;
        String obj2 = d2.toString();
        qVar2.getClass();
        return q.d(obj2);
    }
}
