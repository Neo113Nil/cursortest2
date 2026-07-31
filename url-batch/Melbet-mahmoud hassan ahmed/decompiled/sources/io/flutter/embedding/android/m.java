package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.q;
import l5.d;

/* loaded from: classes.dex */
public class m implements q.d {

    /* renamed from: a, reason: collision with root package name */
    private final l5.d f17152a;

    /* renamed from: b, reason: collision with root package name */
    private final q.b f17153b = new q.b();

    public m(l5.d dVar) {
        this.f17152a = dVar;
    }

    @Override // io.flutter.embedding.android.q.d
    public void a(KeyEvent keyEvent, final q.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f17152a.e(new d.b(keyEvent, this.f17153b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.l
                @Override // l5.d.a
                public final void a(boolean z6) {
                    q.d.a.this.a(z6);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
