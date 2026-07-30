package e0;

import android.app.Activity;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f151a;

    /* renamed from: b, reason: collision with root package name */
    public Object f152b;

    /* renamed from: c, reason: collision with root package name */
    public Object f153c;

    public h0(g0 g0Var) {
        this.f152b = new HashSet();
        this.f153c = g0Var;
        u uVar = (u) g0Var;
        this.f151a = new f0[]{new b0(uVar.getBinaryMessenger()), new c0.a(new m0.b(uVar.getBinaryMessenger()))};
        new androidx.lifecycle.n(uVar.getBinaryMessenger()).f40c = this;
    }

    public void a(int i2, io.flutter.view.f fVar) {
        ((FlutterJNI) this.f152b).dispatchSemanticsAction(i2, fVar);
    }

    public void b(int i2, io.flutter.view.f fVar, Serializable serializable) {
        ((FlutterJNI) this.f152b).dispatchSemanticsAction(i2, fVar, serializable);
    }

    public boolean c(KeyEvent keyEvent) {
        f0[] f0VarArr = (f0[]) this.f151a;
        if (((HashSet) this.f152b).remove(keyEvent)) {
            return false;
        }
        if (f0VarArr.length <= 0) {
            e(keyEvent);
            return true;
        }
        e0 e0Var = new e0(this, keyEvent);
        for (f0 f0Var : f0VarArr) {
            f0Var.h(keyEvent, new d0(e0Var));
        }
        return true;
    }

    public void d(String str, Object obj, m0.k kVar) {
        ((n0.e) this.f151a).k((String) this.f152b, ((n0.j) this.f153c).g(new c0.a(str, obj)), kVar == null ? null : new n0.a(1, this, kVar));
    }

    public void e(KeyEvent keyEvent) {
        io.flutter.plugin.editing.d dVar;
        HashSet hashSet = (HashSet) this.f152b;
        g0 g0Var = (g0) this.f153c;
        if (g0Var != null) {
            u uVar = (u) g0Var;
            io.flutter.plugin.editing.n nVar = uVar.f222l;
            boolean z2 = false;
            if (nVar.f474b.isAcceptingText() && (dVar = nVar.f482j) != null) {
                io.flutter.plugin.editing.g gVar = dVar.f433d;
                if (keyEvent.getAction() == 0) {
                    if (keyEvent.getKeyCode() == 21) {
                        z2 = dVar.d(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 22) {
                        z2 = dVar.d(false, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 19) {
                        z2 = dVar.e(true, keyEvent.isShiftPressed());
                    } else if (keyEvent.getKeyCode() == 20) {
                        z2 = dVar.e(false, keyEvent.isShiftPressed());
                    } else {
                        if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                            EditorInfo editorInfo = dVar.f434e;
                            if ((editorInfo.inputType & 131072) == 0) {
                                dVar.performEditorAction(editorInfo.imeOptions & 255);
                                z2 = true;
                            }
                        }
                        int selectionStart = Selection.getSelectionStart(gVar);
                        int selectionEnd = Selection.getSelectionEnd(gVar);
                        int unicodeChar = keyEvent.getUnicodeChar();
                        if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                            int min = Math.min(selectionStart, selectionEnd);
                            int max = Math.max(selectionStart, selectionEnd);
                            dVar.beginBatchEdit();
                            if (min != max) {
                                gVar.delete(min, max);
                            }
                            gVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                            int i2 = min + 1;
                            dVar.setSelection(i2, i2);
                            dVar.endBatchEdit();
                            z2 = true;
                        }
                    }
                }
            }
            if (z2) {
                return;
            }
            hashSet.add(keyEvent);
            uVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void f(Activity activity, w.j jVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f153c;
        activity.getClass();
        jVar.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f152b;
        reentrantLock.lock();
        try {
            if (jVar.equals((w.j) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((z.l) ((o0.a) this.f151a).f1015b).f1271b.iterator();
            while (it.hasNext()) {
                z.k kVar = (z.k) it.next();
                if (kVar.f1265a.equals(activity)) {
                    kVar.f1267c = jVar;
                    kVar.f1266b.accept(jVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void g(Serializable serializable, n0.b bVar) {
        ((n0.e) this.f151a).k((String) this.f152b, ((n0.h) this.f153c).b(serializable), bVar == null ? null : new n0.a(0, this, bVar));
    }

    public void h(n0.i iVar) {
        ((n0.e) this.f151a).h((String) this.f152b, new c0.a(15, this, iVar));
    }

    public h0(g0.b bVar, FlutterJNI flutterJNI) {
        androidx.lifecycle.n nVar = new androidx.lifecycle.n(10, this);
        h0 h0Var = new h0(bVar, "flutter/accessibility", n0.l.f933a);
        this.f151a = h0Var;
        bVar.h("flutter/accessibility", new c0.a(13, h0Var, nVar));
        this.f152b = flutterJNI;
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3) {
        this.f151a = obj;
        this.f152b = obj2;
        this.f153c = obj3;
    }

    public h0() {
        this.f151a = new ConcurrentLinkedQueue();
    }

    public h0(o0.a aVar) {
        this.f151a = aVar;
        this.f152b = new ReentrantLock();
        this.f153c = new WeakHashMap();
    }
}
