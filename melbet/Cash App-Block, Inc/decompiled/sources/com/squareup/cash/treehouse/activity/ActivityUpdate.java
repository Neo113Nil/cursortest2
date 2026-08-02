package com.squareup.cash.treehouse.activity;

import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes7.dex */
public interface ActivityUpdate {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/ActivityUpdate$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/ActivityUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final KSerializer serializer() {
            ReflectionFactory reflectionFactory = Reflection.factory;
            return new SealedClassSerializer("com.squareup.cash.treehouse.activity.ActivityUpdate", reflectionFactory.getOrCreateKotlinClass(ActivityUpdate.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Feed.class), reflectionFactory.getOrCreateKotlinClass(Item.class)}, new KSerializer[]{new EnumSerializer("Feed", Feed.INSTANCE, new Annotation[0]), ActivityUpdate$Item$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    @SerialName("Feed")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/ActivityUpdate$Feed", "Lcom/squareup/cash/treehouse/activity/ActivityUpdate;", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/ActivityUpdate$Feed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public final /* data */ class Feed implements ActivityUpdate {
        public static final Feed INSTANCE = new Feed();
        public static final /* synthetic */ Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ArticleViewKt$$ExternalSyntheticLambda7(8));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Feed);
        }

        public final int hashCode() {
            return 644960467;
        }

        public final KSerializer serializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final String toString() {
            return "Feed";
        }
    }

    @SerialName("Item")
    @Serializable
    public final class Item implements ActivityUpdate {
        public static final Companion Companion = new Companion();
        public final String id;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/squareup/cash/treehouse/activity/ActivityUpdate$Item$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/squareup/cash/treehouse/activity/ActivityUpdate$Item;", "serializer", "()Lkotlinx/serialization/KSerializer;", "apis"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ActivityUpdate$Item$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Item(int i, String str) {
            if (1 == (i & 1)) {
                this.id = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, ActivityUpdate$Item$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && Intrinsics.areEqual(this.id, ((Item) obj).id);
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Item(id=", this.id, ")");
        }

        public Item(String str) {
            str.getClass();
            this.id = str;
        }
    }
}
