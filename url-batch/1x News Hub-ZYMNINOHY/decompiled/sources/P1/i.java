package P1;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1264a = new i();

    @Override // P1.k
    public final Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            v.f1275b.getClass();
            JSONTokener jSONTokener = new JSONTokener(v.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // P1.k
    public final ByteBuffer encodeMessage(Object obj) {
        if (obj == null) {
            return null;
        }
        Object O2 = S0.a.O(obj);
        if (O2 instanceof String) {
            v vVar = v.f1275b;
            String quote = JSONObject.quote((String) O2);
            vVar.getClass();
            return v.b(quote);
        }
        v vVar2 = v.f1275b;
        String obj2 = O2.toString();
        vVar2.getClass();
        return v.b(obj2);
    }
}
