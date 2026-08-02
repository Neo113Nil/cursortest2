package defpackage;

import android.graphics.Point;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.view.inputmethod.InputConnection;
import com.google.android.apps.authenticator2.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yg {
    static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = ys.a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        acw[] acwVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!i(selectionStart, selectionEnd) && (acwVarArr = (acw[]) editable.getSpans(selectionStart, selectionEnd, acw.class)) != null && (acwVarArr.length) > 0) {
                for (acw acwVar : acwVarArr) {
                    int spanStart = editable.getSpanStart(acwVar);
                    int spanEnd = editable.getSpanEnd(acwVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0041, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007c, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:
    
        if (r11 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009f, code lost:
    
        if (r10 != (-1)) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int min;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!i(selectionStart, selectionEnd)) {
                if (z) {
                    int max = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i2, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        selectionEnd++;
                                        max2--;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            selectionEnd++;
                            max2--;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    min = Math.min(selectionEnd + i2, editable.length());
                }
                acw[] acwVarArr = (acw[]) editable.getSpans(selectionStart, min, acw.class);
                if (acwVarArr != null && (acwVarArr.length) > 0) {
                    for (acw acwVar : acwVarArr) {
                        int spanStart = editable.getSpanStart(acwVar);
                        int spanEnd = editable.getSpanEnd(acwVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    inputConnection.beginBatchEdit();
                    editable.delete(max3, min2);
                    inputConnection.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static final void d(View view) {
        Iterator a = new yt(new kqz(view, null), 2).a();
        while (a.hasNext()) {
            h((View) a.next()).H();
        }
    }

    public static boolean e(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static boolean f(xj xjVar, KeyEvent keyEvent) {
        if (xjVar == null) {
            return false;
        }
        return xjVar.g(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xt g(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        throw new IllegalArgumentException(a.Y(position, "Invalid position: "));
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new xt(i2, radius, center.x, center.y);
    }

    public static final brn h(View view) {
        brn brnVar = (brn) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (brnVar != null) {
            return brnVar;
        }
        brn brnVar2 = new brn((short[]) null, (byte[]) null);
        view.setTag(R.id.pooling_container_listener_holder_tag, brnVar2);
        return brnVar2;
    }

    private static boolean i(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
