package com.chicken.road.cerman.fixs.roost;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: RoostBank.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082 J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostBank;", "", "<init>", "()V", "ok", "", "unpack", "", "idx", "", "at", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostBank {
    public static final int $stable;
    public static final RoostBank INSTANCE = new RoostBank();
    private static volatile boolean ok;

    private final native String unpack(int idx);

    private RoostBank() {
    }

    static {
        Object m6819constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            System.loadLibrary("roostio");
            m6819constructorimpl = Result.m6819constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m6819constructorimpl = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        ok = Result.m6826isSuccessimpl(m6819constructorimpl);
        $stable = 8;
    }

    public final String at(int idx) {
        Object obj;
        if (!ok) {
            return "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RoostBank roostBank = this;
            obj = Result.m6819constructorimpl(unpack(idx));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m6819constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m6825isFailureimpl(obj) ? "" : obj);
    }
}
