package m0;

/* loaded from: classes2.dex */
public class a {
    public static final int STATE_BLUETOOTH_DISABLE = 10;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = 3;
    private int state;

    public a(int i8) {
        this.state = i8;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i8) {
        this.state = i8;
    }
}
