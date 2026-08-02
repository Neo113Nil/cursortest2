package net.idrnd.misnap.iad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ReadyToCapture {
    public static final ReadyToCapture No;
    public static final ReadyToCapture Yes;
    public static final /* synthetic */ ReadyToCapture[] a;

    static {
        ReadyToCapture readyToCapture = new ReadyToCapture("Yes", 0);
        Yes = readyToCapture;
        ReadyToCapture readyToCapture2 = new ReadyToCapture("No", 1);
        No = readyToCapture2;
        a = new ReadyToCapture[]{readyToCapture, readyToCapture2};
    }

    public static ReadyToCapture valueOf(String str) {
        return (ReadyToCapture) Enum.valueOf(ReadyToCapture.class, str);
    }

    public static ReadyToCapture[] values() {
        return (ReadyToCapture[]) a.clone();
    }
}
