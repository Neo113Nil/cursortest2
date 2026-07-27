package y0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f11579a = new AtomicInteger(0);

    public static S.o a(S.o oVar, Function1 function1) {
        return oVar.h(new AppendedSemanticsElement(function1, false));
    }
}
