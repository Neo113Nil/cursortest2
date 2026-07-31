package l5;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import l5.d;
import m5.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final m5.a<Object> f18641a;

    public interface a {
        void a(boolean z6);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f18642a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f18643b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f18642a = keyEvent;
            this.f18643b = ch;
        }
    }

    public d(m5.c cVar) {
        this.f18641a = new m5.a<>(cVar, "flutter/keyevent", m5.f.f19245a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: l5.c
            @Override // m5.a.e
            public final void a(Object obj) {
                d.d(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z6 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f18642a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f18642a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f18642a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f18642a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f18642a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f18642a.getMetaState()));
        Character ch = bVar.f18643b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f18642a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f18642a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f18642a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z6 = false;
        if (obj != null) {
            try {
                z6 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e7) {
                z4.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e7);
            }
        }
        aVar.a(z6);
    }

    public void e(b bVar, boolean z6, a aVar) {
        this.f18641a.d(c(bVar, z6), b(aVar));
    }
}
