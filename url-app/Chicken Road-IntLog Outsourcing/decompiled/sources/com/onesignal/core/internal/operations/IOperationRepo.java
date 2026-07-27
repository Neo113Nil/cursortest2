package com.onesignal.core.internal.operations;

import k4.InterfaceC1218d;
import z4.InterfaceC1586c;

/* loaded from: classes.dex */
public interface IOperationRepo {

    public static final class DefaultImpls {
        public static /* synthetic */ void enqueue$default(IOperationRepo iOperationRepo, Operation operation, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            iOperationRepo.enqueue(operation, z);
        }

        public static /* synthetic */ Object enqueueAndWait$default(IOperationRepo iOperationRepo, Operation operation, boolean z, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
            }
            if ((i2 & 2) != 0) {
                z = false;
            }
            return iOperationRepo.enqueueAndWait(operation, z, interfaceC1218d);
        }
    }

    Object awaitInitialized(InterfaceC1218d interfaceC1218d);

    <T extends Operation> boolean containsInstanceOf(InterfaceC1586c interfaceC1586c);

    void enqueue(Operation operation, boolean z);

    Object enqueueAndWait(Operation operation, boolean z, InterfaceC1218d interfaceC1218d);

    void forceExecuteOperations();
}
