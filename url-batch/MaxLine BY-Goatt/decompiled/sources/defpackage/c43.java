package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface c43 {
    boolean a();

    long e(sd sdVar, sd sdVar2, sd sdVar3);

    sd l(long j, sd sdVar, sd sdVar2, sd sdVar3);

    sd n(long j, sd sdVar, sd sdVar2, sd sdVar3);

    default sd o(sd sdVar, sd sdVar2, sd sdVar3) {
        return l(e(sdVar, sdVar2, sdVar3), sdVar, sdVar2, sdVar3);
    }
}
