package papa.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;

/* loaded from: classes3.dex */
public abstract class InputTracker {
    public static final Handler handler = new Handler(Looper.getMainLooper());
    public static final InputTracker$listener$1 listener = InputTracker$listener$1.INSTANCE;

    public static String getName(KeyEvent keyEvent) {
        keyEvent.getClass();
        StringBuilder sb = new StringBuilder();
        int action = keyEvent.getAction();
        sb.append(action != 0 ? action != 1 ? action != 2 ? String.valueOf(keyEvent.getAction()) : "ACTION_MULTIPLE" : "ACTION_UP" : "ACTION_DOWN");
        sb.append(' ');
        sb.append(KeyEvent.keyCodeToString(keyEvent.getKeyCode()));
        return sb.toString();
    }
}
