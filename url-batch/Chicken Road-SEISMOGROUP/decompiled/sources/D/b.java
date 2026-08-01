package D;

import E.E;
import E.F;
import E.G;
import E.v;
import I.e;
import android.app.Activity;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import e0.h;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.m;
import io.flutter.view.d;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import u.k;
import x.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static b f98d;

    /* renamed from: a, reason: collision with root package name */
    public Object f99a;

    /* renamed from: b, reason: collision with root package name */
    public Object f100b;

    /* renamed from: c, reason: collision with root package name */
    public Object f101c;

    public b(Method method, Method method2, Method method3) {
        this.f99a = method;
        this.f100b = method2;
        this.f101c = method3;
    }

    public static b e() {
        if (f98d == null) {
            A.b bVar = new A.b(2);
            a aVar = new a();
            aVar.f97a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            e eVar = new e();
            eVar.f324a = false;
            eVar.f328e = flutterJNI;
            eVar.f329f = newCachedThreadPool;
            b bVar2 = new b();
            bVar2.f99a = eVar;
            bVar2.f100b = bVar;
            bVar2.f101c = newCachedThreadPool;
            f98d = bVar2;
        }
        return f98d;
    }

    public void a(Activity activity) {
        ReentrantLock reentrantLock = (ReentrantLock) this.f100b;
        reentrantLock.lock();
        try {
            ((WeakHashMap) this.f101c).put(activity, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(int i2, d dVar) {
        ((FlutterJNI) this.f100b).dispatchSemanticsAction(i2, dVar);
    }

    public void c(int i2, d dVar, Serializable serializable) {
        ((FlutterJNI) this.f100b).dispatchSemanticsAction(i2, dVar, serializable);
    }

    public boolean d(KeyEvent keyEvent) {
        if (((HashSet) this.f100b).remove(keyEvent)) {
            return false;
        }
        G[] gArr = (G[]) this.f99a;
        if (gArr.length <= 0) {
            f(keyEvent);
            return true;
        }
        F f2 = new F(this, keyEvent);
        for (G g2 : gArr) {
            g2.c(keyEvent, new E(f2));
        }
        return true;
    }

    public void f(KeyEvent keyEvent) {
        io.flutter.plugin.editing.d dVar;
        v vVar = (v) this.f101c;
        if (vVar != null) {
            m mVar = vVar.f200k;
            boolean z = false;
            if (mVar.f679b.isAcceptingText() && (dVar = mVar.f687j) != null && keyEvent.getAction() == 0) {
                if (keyEvent.getKeyCode() == 21) {
                    z = dVar.d(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 22) {
                    z = dVar.d(false, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 19) {
                    z = dVar.e(true, keyEvent.isShiftPressed());
                } else if (keyEvent.getKeyCode() == 20) {
                    z = dVar.e(false, keyEvent.isShiftPressed());
                } else {
                    if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                        EditorInfo editorInfo = dVar.f637e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            dVar.performEditorAction(editorInfo.imeOptions & 255);
                            z = true;
                        }
                    }
                    g gVar = dVar.f636d;
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
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            HashSet hashSet = (HashSet) this.f100b;
            hashSet.add(keyEvent);
            vVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void g(Activity activity, k kVar) {
        h.e(activity, "activity");
        h.e(kVar, "newLayout");
        ReentrantLock reentrantLock = (ReentrantLock) this.f100b;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f101c;
        try {
            if (kVar.equals((k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((x.k) ((io.flutter.plugin.editing.a) this.f99a).f631c).f1324b.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                if (jVar.f1318a.equals(activity)) {
                    jVar.f1320c = kVar;
                    jVar.f1319b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public b(io.flutter.plugin.editing.a aVar) {
        this.f99a = aVar;
        this.f100b = new ReentrantLock();
        this.f101c = new WeakHashMap();
    }
}
