package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class q implements b.a {

    /* renamed from: a, reason: collision with root package name */
    protected final d[] f17171a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f17172b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final e f17173c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f17174a = 0;

        Character a(int i7) {
            char c7 = (char) i7;
            if ((Integer.MIN_VALUE & i7) != 0) {
                int i8 = i7 & Integer.MAX_VALUE;
                int i9 = this.f17174a;
                if (i9 != 0) {
                    i8 = KeyCharacterMap.getDeadChar(i9, i8);
                }
                this.f17174a = i8;
            } else {
                int i10 = this.f17174a;
                if (i10 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                    if (deadChar > 0) {
                        c7 = (char) deadChar;
                    }
                    this.f17174a = 0;
                }
            }
            return Character.valueOf(c7);
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        final KeyEvent f17175a;

        /* renamed from: b, reason: collision with root package name */
        int f17176b;

        /* renamed from: c, reason: collision with root package name */
        boolean f17177c = false;

        private class a implements d.a {

            /* renamed from: a, reason: collision with root package name */
            boolean f17179a;

            private a() {
                this.f17179a = false;
            }

            @Override // io.flutter.embedding.android.q.d.a
            public void a(boolean z6) {
                if (this.f17179a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f17179a = true;
                c cVar = c.this;
                int i7 = cVar.f17176b - 1;
                cVar.f17176b = i7;
                boolean z7 = z6 | cVar.f17177c;
                cVar.f17177c = z7;
                if (i7 != 0 || z7) {
                    return;
                }
                q.this.d(cVar.f17175a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f17176b = q.this.f17171a.length;
            this.f17175a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z6);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        m5.c getBinaryMessenger();
    }

    public q(e eVar) {
        this.f17173c = eVar;
        this.f17171a = new d[]{new p(eVar.getBinaryMessenger()), new m(new l5.d(eVar.getBinaryMessenger()))};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        e eVar = this.f17173c;
        if (eVar == null || eVar.c(keyEvent)) {
            return;
        }
        this.f17172b.add(keyEvent);
        this.f17173c.a(keyEvent);
        if (this.f17172b.remove(keyEvent)) {
            z4.b.f("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.b.a
    public boolean a(KeyEvent keyEvent) {
        if (this.f17172b.remove(keyEvent)) {
            return false;
        }
        if (this.f17171a.length <= 0) {
            d(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f17171a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void c() {
        int size = this.f17172b.size();
        if (size > 0) {
            z4.b.f("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
