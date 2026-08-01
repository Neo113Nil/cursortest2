package u8;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import androidx.lifecycle.a1;
import androidx.lifecycle.k;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import c4.y;
import com.google.android.gms.internal.measurement.se;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import f4.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d implements kotlin.coroutines.f, t8.a, l8.e {

    /* renamed from: e, reason: collision with root package name */
    public static d f9691e;

    /* renamed from: i, reason: collision with root package name */
    public static d f9692i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ d f9693r = new d(28);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ d f9694s = new d(29);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9695d;

    public d(j jVar) {
        this.f9695d = 24;
        new CopyOnWriteArrayList();
    }

    public static y0 a(a1 a1Var, w0 w0Var, int i3) {
        if ((i3 & 2) != 0) {
            w0Var = a1Var instanceof k ? ((k) a1Var).d() : m4.b.f6554a;
        }
        k4.b e2 = a1Var instanceof k ? ((k) a1Var).e() : k4.a.f5385b;
        w0Var.getClass();
        e2.getClass();
        return new y0(a1Var.f(), w0Var, e2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(e4.b bVar, Editable editable, int i3, int i10, boolean z10) {
        int min;
        if (editable != null && i3 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z10) {
                    int max = Math.max(i3, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z11) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z11 = true;
                                    }
                                } else if (!z11) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i10, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z12 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z12) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z12 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i3, 0);
                    min = Math.min(selectionEnd + i10, editable.length());
                }
                y[] yVarArr = (y[]) editable.getSpans(selectionStart, min, y.class);
                if (yVarArr != null && yVarArr.length > 0) {
                    for (y yVar : yVarArr) {
                        int spanStart = editable.getSpanStart(yVar);
                        int spanEnd = editable.getSpanEnd(yVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l8.e
    public /* synthetic */ Object b(se seVar) {
        i8.a lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(seVar);
        return lambda$getComponents$0;
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    public List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (l8.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f5898a;
            if (str != null) {
                bVar = new l8.b(str, bVar.f5899b, bVar.f5900c, bVar.f5901d, bVar.f5902e, new com.google.firebase.messaging.f(5, str, bVar), bVar.g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f9695d) {
            case 13:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ d(int i3) {
        this.f9695d = i3;
    }
}
