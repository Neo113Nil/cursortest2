package s4;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final k f7765a = new k();

    @Override // s4.m
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object O7 = P0.f.O(obj);
        if (O7 instanceof String) {
            x xVar = x.f7777b;
            String quote = JSONObject.quote((String) O7);
            xVar.getClass();
            return x.d(quote);
        }
        x xVar2 = x.f7777b;
        String obj2 = O7.toString();
        xVar2.getClass();
        return x.d(obj2);
    }

    @Override // s4.m
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            x.f7777b.getClass();
            JSONTokener jSONTokener = new JSONTokener(x.c(byteBuffer));
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
