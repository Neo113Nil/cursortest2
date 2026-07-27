package x0;

import B0.n;
import G0.P;
import android.text.Selection;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import h2.C0482c;
import io.flutter.plugin.editing.g;
import io.flutter.plugin.editing.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.i;
import n1.C1313Q;
import s0.s;
import w2.m;
import w2.r;
import y0.AbstractC1552b;
import y0.C1551a;
import y0.C1553c;
import y0.C1554d;
import z0.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12258a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12259b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12260c;

    public c(n trackers, InterfaceC1536b interfaceC1536b) {
        i.e(trackers, "trackers");
        e tracker = (e) trackers.f167a;
        i.e(tracker, "tracker");
        C1551a c1551a = new C1551a(tracker, 0);
        z0.a tracker2 = (z0.a) trackers.f168b;
        i.e(tracker2, "tracker");
        C1551a c1551a2 = new C1551a(tracker2, 1);
        e tracker3 = (e) trackers.f170d;
        i.e(tracker3, "tracker");
        C1551a c1551a3 = new C1551a(tracker3, 4);
        e tracker4 = (e) trackers.f169c;
        i.e(tracker4, "tracker");
        C1551a c1551a4 = new C1551a(tracker4, 2);
        i.e(tracker4, "tracker");
        C1551a c1551a5 = new C1551a(tracker4, 3);
        i.e(tracker4, "tracker");
        C1554d c1554d = new C1554d(tracker4);
        i.e(tracker4, "tracker");
        AbstractC1552b[] abstractC1552bArr = {c1551a, c1551a2, c1551a3, c1551a4, c1551a5, c1554d, new C1553c(tracker4)};
        this.f12258a = interfaceC1536b;
        this.f12259b = abstractC1552bArr;
        this.f12260c = new Object();
    }

    public boolean a(String workSpecId) {
        AbstractC1552b abstractC1552b;
        boolean z;
        i.e(workSpecId, "workSpecId");
        synchronized (this.f12260c) {
            try {
                AbstractC1552b[] abstractC1552bArr = (AbstractC1552b[]) this.f12259b;
                int length = abstractC1552bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        abstractC1552b = null;
                        break;
                    }
                    abstractC1552b = abstractC1552bArr[i2];
                    abstractC1552b.getClass();
                    Object obj = abstractC1552b.f12336d;
                    if (obj != null && abstractC1552b.b(obj) && abstractC1552b.f12335c.contains(workSpecId)) {
                        break;
                    }
                    i2++;
                }
                if (abstractC1552b != null) {
                    s.d().a(d.f12261a, "Work " + workSpecId + " constrained by " + abstractC1552b.getClass().getSimpleName());
                }
                z = abstractC1552b == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean b(KeyEvent keyEvent) {
        if (((HashSet) this.f12259b).remove(keyEvent)) {
            return false;
        }
        w2.s[] sVarArr = (w2.s[]) this.f12258a;
        if (sVarArr.length <= 0) {
            c(keyEvent);
            return true;
        }
        C1313Q c1313q = new C1313Q(this, keyEvent);
        for (w2.s sVar : sVarArr) {
            P p5 = new P();
            p5.f797b = c1313q;
            p5.f796a = false;
            sVar.b(keyEvent, p5);
        }
        return true;
    }

    public void c(KeyEvent keyEvent) {
        io.flutter.plugin.editing.d dVar;
        m mVar = (m) this.f12260c;
        if (mVar != null) {
            j jVar = mVar.f12181l;
            boolean z = false;
            if (jVar.f10194b.isAcceptingText() && (dVar = jVar.f10202j) != null && keyEvent.getAction() == 0) {
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
                        EditorInfo editorInfo = dVar.f10158e;
                        if ((editorInfo.inputType & 131072) == 0) {
                            dVar.performEditorAction(editorInfo.imeOptions & KotlinVersion.MAX_COMPONENT_VALUE);
                            z = true;
                        }
                    }
                    g gVar = dVar.f10157d;
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
            HashSet hashSet = (HashSet) this.f12259b;
            hashSet.add(keyEvent);
            mVar.getRootView().dispatchKeyEvent(keyEvent);
            if (hashSet.remove(keyEvent)) {
                Log.w("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public void d(Collection workSpecs) {
        i.e(workSpecs, "workSpecs");
        synchronized (this.f12260c) {
            try {
                for (AbstractC1552b abstractC1552b : (AbstractC1552b[]) this.f12259b) {
                    if (abstractC1552b.f12337e != null) {
                        abstractC1552b.f12337e = null;
                        abstractC1552b.d(null, abstractC1552b.f12336d);
                    }
                }
                for (AbstractC1552b abstractC1552b2 : (AbstractC1552b[]) this.f12259b) {
                    abstractC1552b2.c(workSpecs);
                }
                for (AbstractC1552b abstractC1552b3 : (AbstractC1552b[]) this.f12259b) {
                    if (abstractC1552b3.f12337e != this) {
                        abstractC1552b3.f12337e = this;
                        abstractC1552b3.d(this, abstractC1552b3.f12336d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f12260c) {
            for (AbstractC1552b abstractC1552b : (AbstractC1552b[]) this.f12259b) {
                ArrayList arrayList = abstractC1552b.f12334b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC1552b.f12333a.b(abstractC1552b);
                }
            }
        }
    }

    public c(m mVar) {
        this.f12259b = new HashSet();
        this.f12260c = mVar;
        this.f12258a = new w2.s[]{new r(mVar.getBinaryMessenger()), new B0.c(new B1.g(mVar.getBinaryMessenger()))};
        new C0482c(mVar.getBinaryMessenger()).f5783b = this;
    }
}
