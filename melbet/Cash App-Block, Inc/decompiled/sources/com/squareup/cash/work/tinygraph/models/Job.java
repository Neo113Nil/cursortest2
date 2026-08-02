package com.squareup.cash.work.tinygraph.models;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.jvm.functions.Function0;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Job;", "Lcom/squareup/cash/work/tinygraph/models/IBaseEntity;", "", "id", "", "createdAt", "updatedAt", "", "protoJson", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "merchantId", "<init>", "(Ljava/lang/String;JJLjava/lang/Object;Lcom/squareup/cash/work/tinygraph/models/EntityReference;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "getCreatedAt", "()J", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Ljava/lang/Object;", "getProtoJson", "()Ljava/lang/Object;", "getProtoJson$annotations", "Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getMerchantId", "()Lcom/squareup/cash/work/tinygraph/models/EntityReference;", "getMerchantId$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Job implements IBaseEntity {
    public final long createdAt;
    public final String id;
    public final EntityReference merchantId;
    public final Object protoJson;
    public final transient Lazy protoModel$delegate;
    public final Lazy title$delegate;
    public final Lazy token$delegate;
    public final long updatedAt;

    public Job(@Json(name = "id") String str, @Json(name = "createdAt") long j, @Json(name = "updatedAt") long j2, @Json(name = "proto") Object obj, @Json(name = "merchantId") EntityReference entityReference) {
        str.getClass();
        this.id = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.protoJson = obj;
        this.merchantId = entityReference;
        final int i = 0;
        this.protoModel$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.work.tinygraph.models.Job$$ExternalSyntheticLambda0
            public final /* synthetic */ Job f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object failure;
                Object obj2;
                int i2 = i;
                Job job = this.f$0;
                switch (i2) {
                    case 0:
                        Object obj3 = job.protoJson;
                        if (obj3 != null) {
                            Moshi moshi = ProtoDeserializer.moshi;
                            try {
                                Result.Companion companion = Result.Companion;
                                Moshi moshi2 = ProtoDeserializer.moshi;
                                moshi2.getClass();
                                failure = moshi2.adapter(com.squareup.protos.employeejobs.Job.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj3);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.squareup.protos.employeejobs.Job job2 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job2 != null ? job2.title : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                    default:
                        com.squareup.protos.employeejobs.Job job3 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job3 != null ? job3.token : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                }
                return obj2;
            }
        });
        final int i2 = 1;
        this.title$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.work.tinygraph.models.Job$$ExternalSyntheticLambda0
            public final /* synthetic */ Job f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object failure;
                Object obj2;
                int i22 = i2;
                Job job = this.f$0;
                switch (i22) {
                    case 0:
                        Object obj3 = job.protoJson;
                        if (obj3 != null) {
                            Moshi moshi = ProtoDeserializer.moshi;
                            try {
                                Result.Companion companion = Result.Companion;
                                Moshi moshi2 = ProtoDeserializer.moshi;
                                moshi2.getClass();
                                failure = moshi2.adapter(com.squareup.protos.employeejobs.Job.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj3);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.squareup.protos.employeejobs.Job job2 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job2 != null ? job2.title : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                    default:
                        com.squareup.protos.employeejobs.Job job3 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job3 != null ? job3.token : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                }
                return obj2;
            }
        });
        final int i3 = 2;
        this.token$delegate = LazyKt.lazy(new Function0(this) { // from class: com.squareup.cash.work.tinygraph.models.Job$$ExternalSyntheticLambda0
            public final /* synthetic */ Job f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object failure;
                Object obj2;
                int i22 = i3;
                Job job = this.f$0;
                switch (i22) {
                    case 0:
                        Object obj3 = job.protoJson;
                        if (obj3 != null) {
                            Moshi moshi = ProtoDeserializer.moshi;
                            try {
                                Result.Companion companion = Result.Companion;
                                Moshi moshi2 = ProtoDeserializer.moshi;
                                moshi2.getClass();
                                failure = moshi2.adapter(com.squareup.protos.employeejobs.Job.class, Util.NO_ANNOTATIONS, null).fromJsonValue(obj3);
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                failure = new Result.Failure(th);
                            }
                            break;
                        }
                        break;
                    case 1:
                        com.squareup.protos.employeejobs.Job job2 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job2 != null ? job2.title : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                    default:
                        com.squareup.protos.employeejobs.Job job3 = (com.squareup.protos.employeejobs.Job) job.protoModel$delegate.getValue();
                        obj2 = job3 != null ? job3.token : null;
                        if (obj2 != null) {
                            break;
                        }
                        break;
                }
                return obj2;
            }
        });
    }

    @Json(name = "createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "merchantId")
    public static /* synthetic */ void getMerchantId$annotations() {
    }

    @Json(name = "proto")
    public static /* synthetic */ void getProtoJson$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final String getId() {
        return this.id;
    }

    public final String getToken() {
        return (String) this.token$delegate.getValue();
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
