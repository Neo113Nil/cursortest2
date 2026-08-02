package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum gps {
    ON_CHARGER(1),
    ON_NETWORK_UNMETERED(2),
    ON_NETWORK_CONNECTED(4);

    public final int d;

    gps(int i) {
        this.d = i;
    }
}
