package androidx.core.view;

import a2.AbstractC1241b;
import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1295h0 {

    /* renamed from: androidx.core.view.h0$a */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* renamed from: m, reason: collision with root package name */
        int f11962m;

        /* renamed from: n, reason: collision with root package name */
        private /* synthetic */ Object f11963n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f11964o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f11964o = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.j jVar, kotlin.coroutines.d dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f11964o, dVar);
            aVar.f11963n = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r1.c(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        
            if (r1.a(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.j jVar;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f11962m;
            if (i4 == 0) {
                ResultKt.a(obj);
                jVar = (kotlin.sequences.j) this.f11963n;
                View view = this.f11964o;
                this.f11963n = jVar;
                this.f11962m = 1;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return Unit.f41027a;
                }
                jVar = (kotlin.sequences.j) this.f11963n;
                ResultKt.a(obj);
            }
            View view2 = this.f11964o;
            if (view2 instanceof ViewGroup) {
                Sequence c4 = AbstractC1293g0.c((ViewGroup) view2);
                this.f11963n = null;
                this.f11962m = 2;
            }
            return Unit.f41027a;
        }
    }

    public static final Sequence a(View view) {
        return kotlin.sequences.k.b(new a(view, null));
    }
}
