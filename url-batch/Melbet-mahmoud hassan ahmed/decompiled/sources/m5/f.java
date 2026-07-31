package m5;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class f implements i<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f19245a = new f();

    private f() {
    }

    @Override // m5.i
    public ByteBuffer a(Object obj) {
        s sVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a7 = h.a(obj);
        if (a7 instanceof String) {
            sVar = s.f19265b;
            obj2 = JSONObject.quote((String) a7);
        } else {
            sVar = s.f19265b;
            obj2 = a7.toString();
        }
        return sVar.a(obj2);
    }

    @Override // m5.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(s.f19265b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
