package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler;
import io.reactivex.rxjava3.internal.schedulers.IoScheduler;
import io.reactivex.rxjava3.internal.schedulers.NewThreadScheduler;
import io.reactivex.rxjava3.internal.schedulers.SingleScheduler;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import java.util.Objects;

/* loaded from: classes9.dex */
public abstract class Schedulers {
    public static final ComputationScheduler COMPUTATION;
    public static final Scheduler IO;

    public abstract class ComputationHolder {
        public static final ComputationScheduler DEFAULT = new ComputationScheduler();
    }

    public abstract class IoHolder {
        public static final IoScheduler DEFAULT = new IoScheduler();
    }

    public abstract class NewThreadHolder {
        public static final NewThreadScheduler DEFAULT = new NewThreadScheduler();
    }

    public abstract class SingleHolder {
        public static final SingleScheduler DEFAULT = new SingleScheduler();
    }

    static {
        RuntimeException wrapOrThrow;
        try {
            Objects.requireNonNull(SingleHolder.DEFAULT, "Scheduler Supplier result can't be null");
            try {
                ComputationScheduler computationScheduler = ComputationHolder.DEFAULT;
                Objects.requireNonNull(computationScheduler, "Scheduler Supplier result can't be null");
                COMPUTATION = computationScheduler;
                try {
                    IoScheduler ioScheduler = IoHolder.DEFAULT;
                    Objects.requireNonNull(ioScheduler, "Scheduler Supplier result can't be null");
                    IO = ioScheduler;
                    int i = TrampolineScheduler.$r8$clinit;
                    try {
                        Objects.requireNonNull(NewThreadHolder.DEFAULT, "Scheduler Supplier result can't be null");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
