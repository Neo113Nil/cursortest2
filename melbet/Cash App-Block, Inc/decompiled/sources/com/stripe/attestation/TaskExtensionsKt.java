package com.stripe.attestation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.Task;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.formview.viewmodels.BlockerIdentifiers;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import retrofit2.KotlinExtensions$awaitResponse$2$2;

/* loaded from: classes4.dex */
public abstract class TaskExtensionsKt {
    public static Object awaitTask$default(Task task, ContinuationImpl continuationImpl) {
        if (task.isComplete()) {
            return task;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuationImpl));
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(DirectExecutor.INSTANCE, new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, 3));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static final BlockerIdentifiers toBlockerIdentifiers(BlockersScreens blockersScreens) {
        blockersScreens.getClass();
        return new BlockerIdentifiers(blockersScreens.getBlockersData().flow, blockersScreens.getBlockersData().flowType, blockersScreens.getBlockersData().blockerId);
    }

    public static final Object toResult(Task task) {
        task.getClass();
        if (task.isSuccessful()) {
            Result.Companion companion = Result.Companion;
            return task.getResult();
        }
        if (task.isCanceled()) {
            Result.Companion companion2 = Result.Companion;
            return new Result.Failure(new CancellationException("Task was canceled"));
        }
        Result.Companion companion3 = Result.Companion;
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception("Unknown error occurred");
        }
        return new Result.Failure(exception);
    }

    public static String zzb(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) "\n");
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            return sb.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
