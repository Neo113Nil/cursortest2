package C;

import D.H;
import D.I;
import D.J;
import D.y;
import I.e;
import M.k;
import N.f;
import android.app.Activity;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import e0.h;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.editing.l;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import v.C0108k;
import y.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f12d;

    /* renamed from: a, reason: collision with root package name */
    public Object f13a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f13a = obj;
        this.f14b = obj2;
        this.f15c = obj3;
    }

    public static b e() {
        if (f12d == null) {
            B.b bVar = new B.b(2);
            a aVar = new a();
            aVar.f11a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            e eVar = new e();
            eVar.f259a = false;
            eVar.f263e = flutterJNI;
            eVar.f264f = newCachedThreadPool;
            b bVar2 = new b();
            bVar2.f13a = eVar;
            bVar2.f14b = bVar;
            bVar2.f15c = newCachedThreadPool;
            f12d = bVar2;
        }
        return f12d;
    }

    public void a(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f14b;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f15c).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(int i2, io.flutter.view.e eVar) {
        ((FlutterJNI) this.f14b).dispatchSemanticsAction(i2, eVar);
    }

    public void c(int i2, io.flutter.view.e eVar, Serializable serializable) {
        ((FlutterJNI) this.f14b).dispatchSemanticsAction(i2, eVar, serializable);
    }

    public boolean d(KeyEvent keyEvent) {
        if (((HashSet) this.f14b).remove(keyEvent)) {
            return false;
        }
        J[] jArr = (J[]) this.f13a;
        if (jArr.length <= 0) {
            g(keyEvent);
            return true;
        }
        I i2 = new I(this, keyEvent);
        for (J j2 : jArr) {
            j2.a(keyEvent, new H(i2));
        }
        return true;
    }

    public void f(String str, Object obj, k kVar) {
        ((f) this.f13a).f((String) this.f14b, ((N.k) this.f15c).f(new B.a(12, str, obj)), kVar == null ? null : new N.a(1, this, kVar));
    }

    public void g(KeyEvent keyEvent) {
        c cVar;
        y yVar = (y) this.f15c;
        if (yVar != null) {
            l lVar = yVar.f132m;
            boolean z2 = false;
            if (lVar.f624b.isAcceptingText() && (cVar = lVar.f632j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z2 = cVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z2 = cVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z2 = cVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z2 = cVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = cVar.f582e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            cVar.performEditorAction(editorInfo.imeOptions & 255);
                            z2 = true;
                        }
                    }
                    io.flutter.plugin.editing.f fVar = cVar.f581d;
                    int selectionStart = Selection.getSelectionStart(fVar);
                    int selectionEnd = Selection.getSelectionEnd(fVar);
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                        int min = Math.min(selectionStart, selectionEnd);
                        int max = Math.max(selectionStart, selectionEnd);
                        cVar.beginBatchEdit();
                        if (min != max) {
                            fVar.delete(min, max);
                        }
                        fVar.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                        int i2 = min + 1;
                        cVar.setSelection(i2, i2);
                        cVar.endBatchEdit();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                return;
            }
            HashSet hashSet = (HashSet) this.f14b;
            hashSet.add(keyEvent);
            yVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void h(Activity activity, C0108k c0108k) {
        h.e(activity, "activity");
        h.e(c0108k, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f14b;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f15c;
        try {
            if (c0108k.equals((C0108k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((y.k) ((io.flutter.plugin.platform.c) this.f13a).f642c).f1327b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar.f1321a.equals(activity)) {
                    jVar.f1323c = c0108k;
                    jVar.f1322b.accept(c0108k);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void i(N.j jVar) {
        ((f) this.f13a).b((String) this.f14b, new B.a(this, jVar, 13, false));
    }

    public b(io.flutter.plugin.platform.c cVar) {
        this.f13a = cVar;
        this.f14b = new ReentrantLock();
        this.f15c = new WeakHashMap();
    }
}
