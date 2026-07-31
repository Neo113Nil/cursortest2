package D3;

import android.view.KeyCharacterMap;
import com.onesignal.inAppMessages.internal.display.impl.a;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public int f384a;

    public A(int i7, boolean z5) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f384a = D4.i.f530n.getAndIncrement();
                break;
            default:
                this.f384a = 0;
                break;
        }
    }

    public Character a(int i7) {
        char c7 = (char) i7;
        if ((Integer.MIN_VALUE & i7) != 0) {
            int i8 = i7 & Integer.MAX_VALUE;
            int i9 = this.f384a;
            if (i9 != 0) {
                this.f384a = KeyCharacterMap.getDeadChar(i9, i8);
            } else {
                this.f384a = i8;
            }
        } else {
            int i10 = this.f384a;
            if (i10 != 0) {
                int deadChar = KeyCharacterMap.getDeadChar(i10, i7);
                if (deadChar > 0) {
                    c7 = (char) deadChar;
                }
                this.f384a = 0;
            }
        }
        return Character.valueOf(c7);
    }

    public A(int i7) {
        this.f384a = i7;
    }
}
