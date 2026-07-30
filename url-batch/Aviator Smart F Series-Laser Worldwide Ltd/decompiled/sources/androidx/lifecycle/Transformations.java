package androidx.lifecycle;

import androidx.annotation.CheckResult;
import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.s;
import y5.w;

/* loaded from: classes.dex */
public final class Transformations {
    @CheckResult
    @MainThread
    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        s.checkNotNullParameter(liveData, "<this>");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            ref$BooleanRef.element = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new f6.l() { // from class: androidx.lifecycle.Transformations$distinctUntilChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m76invoke((Transformations$distinctUntilChanged$1) obj);
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m76invoke(X x7) {
                Object value = mediatorLiveData.getValue();
                if (ref$BooleanRef.element || ((value == null && x7 != 0) || !(value == null || s.areEqual(value, x7)))) {
                    ref$BooleanRef.element = false;
                    mediatorLiveData.setValue(x7);
                }
            }
        }));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final f6.l transform) {
        s.checkNotNullParameter(liveData, "<this>");
        s.checkNotNullParameter(transform, "transform");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new f6.l() { // from class: androidx.lifecycle.Transformations$map$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m77invoke((Transformations$map$1) obj);
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke(X x7) {
                mediatorLiveData.setValue(transform.invoke(x7));
            }
        }));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final f6.l transform) {
        s.checkNotNullParameter(liveData, "<this>");
        s.checkNotNullParameter(transform, "transform");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations$switchMap$1
            private LiveData<Y> liveData;

            public final LiveData<Y> getLiveData() {
                return this.liveData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x7) {
                LiveData<Y> liveData2 = (LiveData) f6.l.this.invoke(x7);
                Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    s.checkNotNull(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    s.checkNotNull(liveData2);
                    final MediatorLiveData<Y> mediatorLiveData4 = mediatorLiveData;
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new f6.l() { // from class: androidx.lifecycle.Transformations$switchMap$1$onChanged$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // f6.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m79invoke((Transformations$switchMap$1$onChanged$1) obj2);
                            return w.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m79invoke(Y y7) {
                            mediatorLiveData4.setValue(y7);
                        }
                    }));
                }
            }

            public final void setLiveData(LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData map(LiveData liveData, final Function mapFunction) {
        s.checkNotNullParameter(liveData, "<this>");
        s.checkNotNullParameter(mapFunction, "mapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new f6.l() { // from class: androidx.lifecycle.Transformations$map$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m78invoke(obj);
                return w.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m78invoke(Object obj) {
                MediatorLiveData.this.setValue(mapFunction.apply(obj));
            }
        }));
        return mediatorLiveData;
    }

    @CheckResult
    @MainThread
    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        s.checkNotNullParameter(liveData, "<this>");
        s.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations$switchMap$2
            private LiveData liveData;

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) Function.this.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                if (liveData3 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    s.checkNotNull(liveData3);
                    mediatorLiveData2.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData3 = mediatorLiveData;
                    s.checkNotNull(liveData2);
                    final MediatorLiveData mediatorLiveData4 = mediatorLiveData;
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new f6.l() { // from class: androidx.lifecycle.Transformations$switchMap$2$onChanged$1
                        {
                            super(1);
                        }

                        @Override // f6.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            m80invoke(obj2);
                            return w.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m80invoke(Object obj2) {
                            MediatorLiveData.this.setValue(obj2);
                        }
                    }));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
