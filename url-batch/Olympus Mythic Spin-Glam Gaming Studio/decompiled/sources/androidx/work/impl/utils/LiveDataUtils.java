package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

@RestrictTo
/* loaded from: classes5.dex */
public class LiveDataUtils {

    /* renamed from: androidx.work.impl.utils.LiveDataUtils$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    class AnonymousClass1 implements Observer<Object> {
        Object mCurrentOutput;
        final /* synthetic */ Object val$lock;
        final /* synthetic */ Function val$mappingMethod;
        final /* synthetic */ MediatorLiveData val$outputLiveData;
        final /* synthetic */ TaskExecutor val$workTaskExecutor;

        @Override // androidx.lifecycle.Observer
        public void onChanged(final Object obj) {
            this.val$workTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.LiveDataUtils.1.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (AnonymousClass1.this.val$lock) {
                        try {
                            Object apply = AnonymousClass1.this.val$mappingMethod.apply(obj);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            Object obj2 = anonymousClass1.mCurrentOutput;
                            if (obj2 == null && apply != null) {
                                anonymousClass1.mCurrentOutput = apply;
                                anonymousClass1.val$outputLiveData.postValue(apply);
                            } else if (obj2 != null && !obj2.equals(apply)) {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                anonymousClass12.mCurrentOutput = apply;
                                anonymousClass12.val$outputLiveData.postValue(apply);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }
}
