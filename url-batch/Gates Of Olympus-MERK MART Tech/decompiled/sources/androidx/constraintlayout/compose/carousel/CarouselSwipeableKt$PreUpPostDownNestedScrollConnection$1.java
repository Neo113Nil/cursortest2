package androidx.constraintlayout.compose.carousel;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: CarouselSwipeable.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"androidx/constraintlayout/compose/carousel/CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "(J)F", "toOffset", "(F)J", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ CarouselSwipeableState<T> $this_PreUpPostDownNestedScrollConnection;

    CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1(CarouselSwipeableState<T> carouselSwipeableState) {
        this.$this_PreUpPostDownNestedScrollConnection = carouselSwipeableState;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo1010onPreScrollOzD1aCk(long available, int source) {
        float f = toFloat(available);
        if (f < 0.0f && NestedScrollSource.m6581equalsimpl0(source, NestedScrollSource.INSTANCE.m6593getUserInputWNlRxjI())) {
            return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(f));
        }
        return Offset.INSTANCE.m5164getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo657onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (NestedScrollSource.m6581equalsimpl0(source, NestedScrollSource.INSTANCE.m6593getUserInputWNlRxjI())) {
            return toOffset(this.$this_PreUpPostDownNestedScrollConnection.performDrag(toFloat(available)));
        }
        return Offset.INSTANCE.m5164getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo1009onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1;
        int i;
        if (continuation instanceof CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) {
            carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = (CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) continuation;
            if ((carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label -= Integer.MIN_VALUE;
                Object obj = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    float f = toFloat(OffsetKt.Offset(Velocity.m8465getXimpl(j), Velocity.m8466getYimpl(j)));
                    if (f < 0.0f && this.$this_PreUpPostDownNestedScrollConnection.getOffset().getFloatValue() > this.$this_PreUpPostDownNestedScrollConnection.getMinBound()) {
                        CarouselSwipeableState<T> carouselSwipeableState = this.$this_PreUpPostDownNestedScrollConnection;
                        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0 = j;
                        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label = 1;
                        if (carouselSwipeableState.performFling(f, carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j = Velocity.INSTANCE.m8476getZero9UxMQ8M();
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m8456boximpl(j);
            }
        }
        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1 = new CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1(this, continuation);
        Object obj2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPreFling$1.label;
        if (i != 0) {
        }
        return Velocity.m8456boximpl(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo656onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) {
            carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = (CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) continuation;
            if ((carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                Object obj = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CarouselSwipeableState<T> carouselSwipeableState = this.$this_PreUpPostDownNestedScrollConnection;
                    float f = toFloat(OffsetKt.Offset(Velocity.m8465getXimpl(j2), Velocity.m8466getYimpl(j2)));
                    carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                    carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label = 1;
                    if (carouselSwipeableState.performFling(f, carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m8456boximpl(j2);
            }
        }
        carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1 = new CarouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1(this, continuation);
        Object obj2 = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = carouselSwipeableKt$PreUpPostDownNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        return Velocity.m8456boximpl(j2);
    }

    private final long toOffset(float f) {
        return OffsetKt.Offset(0.0f, f);
    }

    private final float toFloat(long j) {
        return Offset.m5149getYimpl(j);
    }
}
