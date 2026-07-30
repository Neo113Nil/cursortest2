package com.chicken.road.cerman.fixs.ui.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.chicken.road.cerman.fixs.data.Vaccination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: HealthScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HealthScreenKt$AddVaccineDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $dueDays$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<String> $notes$delegate;
    final /* synthetic */ Function1<Vaccination, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $pickedId$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HealthScreenKt$AddVaccineDialog$1(Function1<? super Vaccination, Unit> function1, MutableState<Integer> mutableState, MutableState<Long> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4) {
        this.$onSave = function1;
        this.$dueDays$delegate = mutableState;
        this.$pickedId$delegate = mutableState2;
        this.$name$delegate = mutableState3;
        this.$notes$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 ??, still in use, count: 1, list:
          (r1v4 ?? I:java.lang.Object) from 0x004d: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:294)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 ??, still in use, count: 1, list:
          (r1v4 ?? I:java.lang.Object) from 0x004d: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v4 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:294)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        Integer AddVaccineDialog$lambda$36;
        Long l;
        Long AddVaccineDialog$lambda$33;
        String AddVaccineDialog$lambda$27;
        String AddVaccineDialog$lambda$30;
        AddVaccineDialog$lambda$36 = HealthScreenKt.AddVaccineDialog$lambda$36(mutableState);
        if (AddVaccineDialog$lambda$36 != null) {
            long j = 60;
            l = Long.valueOf(System.currentTimeMillis() + (AddVaccineDialog$lambda$36.intValue() * 24 * j * j * 1000));
        } else {
            l = null;
        }
        Long l2 = l;
        AddVaccineDialog$lambda$33 = HealthScreenKt.AddVaccineDialog$lambda$33(mutableState2);
        AddVaccineDialog$lambda$27 = HealthScreenKt.AddVaccineDialog$lambda$27(mutableState3);
        AddVaccineDialog$lambda$30 = HealthScreenKt.AddVaccineDialog$lambda$30(mutableState4);
        function1.invoke(new Vaccination(0L, AddVaccineDialog$lambda$33, 0L, AddVaccineDialog$lambda$27, StringsKt.trim((CharSequence) AddVaccineDialog$lambda$30).toString(), l2, l2 == null, 5, null));
        return Unit.INSTANCE;
    }
}
