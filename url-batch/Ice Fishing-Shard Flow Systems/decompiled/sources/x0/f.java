package x0;

import C4.p;
import R5.k;
import android.util.Log;
import com.google.firebase.messaging.y;
import java.util.Collection;
import kotlin.collections.A;
import kotlin.collections.o;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f8301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8302c;

    /* renamed from: d, reason: collision with root package name */
    public final C0994a f8303d;

    /* renamed from: e, reason: collision with root package name */
    public final h f8304e;

    /* renamed from: f, reason: collision with root package name */
    public final y f8305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object value, String message, C0994a logger, h verificationMode) {
        super(20);
        Collection r7;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f8301b = value;
        this.f8302c = message;
        this.f8303d = logger;
        this.f8304e = verificationMode;
        String message2 = V6.b.s(value, message);
        Intrinsics.checkNotNullParameter(message2, "message");
        y yVar = new y(message2);
        StackTraceElement[] stackTrace = yVar.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(stackTrace, "<this>");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        Intrinsics.checkNotNullParameter(stackTrace, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(p.h(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            r7 = A.f6115d;
        } else {
            int length2 = stackTrace.length;
            r7 = length >= length2 ? kotlin.collections.p.r(stackTrace) : length == 1 ? q.b(stackTrace[length2 - 1]) : o.b(o.h(stackTrace, length2 - length, length2));
        }
        yVar.setStackTrace((StackTraceElement[]) r7.toArray(new StackTraceElement[0]));
        this.f8305f = yVar;
    }

    @Override // V6.b
    public final V6.b L(String message, Function1 condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }

    @Override // V6.b
    public final Object b() {
        int ordinal = this.f8304e.ordinal();
        if (ordinal == 0) {
            throw this.f8305f;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            throw new k();
        }
        String message = V6.b.s(this.f8301b, this.f8302c);
        this.f8303d.getClass();
        Intrinsics.checkNotNullParameter("g", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("g", message);
        return null;
    }
}
