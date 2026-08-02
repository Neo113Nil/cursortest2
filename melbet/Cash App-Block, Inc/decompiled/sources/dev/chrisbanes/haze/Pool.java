package dev.chrisbanes.haze;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.core.os.BundleKt;
import com.datadog.android.trace.DatadogTracing;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.EmployeeJobInfo;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.scannerview.PreviewView;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.stripe.android.StripePaymentController;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.stripe3ds2.utils.AnalyticsDelegate;
import com.stripe.android.view.ActivityHost;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import io.opentelemetry.api.internal.ApiUsageLogger;
import io.opentelemetry.api.internal.AutoValue_ImmutableSpanContext;
import io.opentelemetry.api.trace.PropagatedSpan;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.context.ArrayBasedContext;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.LazyStorage;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import net.idrnd.face.iad.capture.internal.i4;
import net.idrnd.face.iad.capture.internal.u3;
import net.idrnd.face.iad.capture.internal.y2;
import net.idrnd.misnap.iad.Payload;
import net.idrnd.misnap.iad.PayloadSize;
import okhttp3.ResponseBody;
import org.androidannotations.api.sharedpreferences.SharedPreferencesCompat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.Converter;
import retrofit2.HttpException;
import retrofit2.Response;

/* loaded from: classes9.dex */
public final class Pool implements PreviewView.Callback, CardAccountRangeSource, Stripe3ds2TransactionStarter, SpanBuilder, DeclarationDescriptorVisitor, Callback, Converter {
    public static Pool provider;
    public Object pool;

    public Pool(int i) {
        switch (i) {
            case 1:
                this.pool = Mac.getInstance("HmacSHA256");
                return;
            case 8:
                ServiceLoader load = ServiceLoader.load(AnalyticsDelegate.class);
                load.getClass();
                this.pool = load;
                return;
            case 14:
                u3 u3Var = u3.a;
                PayloadSize[] payloadSizeArr = PayloadSize.a;
                int i2 = i4.a[1];
                y2 y2Var = null;
                if (i2 != -1) {
                    if (i2 == 1) {
                        y2Var = y2.b;
                    } else {
                        if (i2 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            throw null;
                        }
                        y2Var = y2.a;
                    }
                }
                this.pool = y2Var;
                return;
            default:
                MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
                this.pool = new MutableScatterSet();
                return;
        }
    }

    public static Money calculateEarnedWage$default(Pool pool, Timecard timecard, List list, TimecardBreak timecardBreak, Long l, int i) {
        Money money;
        Long l2;
        long longValue;
        long j;
        long j2;
        long j3;
        TimecardBreak timecardBreak2 = (i & 4) != 0 ? null : timecardBreak;
        Long l3 = (i & 8) != 0 ? null : l;
        list.getClass();
        if (timecard != null) {
            EmployeeJobInfo employeeJobInfo = timecard.employee_job_info;
            if (employeeJobInfo == null || (money = employeeJobInfo.hourly_wage) == null) {
                money = timecard.hourly_wage;
            }
            if (money != null && (l2 = money.amount) != null) {
                long longValue2 = l2.longValue();
                Long l4 = timecard.clockin_timestamp_ms;
                if (l4 != null) {
                    long longValue3 = l4.longValue();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (timecardBreak2 == null || !(!Intrinsics.areEqual(timecardBreak2.is_paid, Boolean.TRUE))) {
                        longValue = l3 != null ? l3.longValue() : ((AndroidClock) pool.pool).millis();
                    } else {
                        Long l5 = timecardBreak2.start_timestamp_seconds;
                        longValue = timeUnit.toMillis(l5 != null ? l5.longValue() : 0L);
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        TimecardBreak timecardBreak3 = (TimecardBreak) it.next();
                        if (timecardBreak3.stop_timestamp_seconds == null || Intrinsics.areEqual(timecardBreak3.is_paid, Boolean.TRUE)) {
                            j2 = 0;
                        } else {
                            Long l6 = timecardBreak3.stop_timestamp_seconds;
                            long millis = timeUnit.toMillis(l6 != null ? l6.longValue() : 0L);
                            Long l7 = timecardBreak3.start_timestamp_seconds;
                            j2 = 0;
                            j3 = millis - timeUnit.toMillis(l7 != null ? l7.longValue() : 0L);
                            j = j3 >= 0 ? j + j3 : 0L;
                        }
                        j3 = j2;
                    }
                    long j4 = (longValue - longValue3) - j;
                    return new Money(Long.valueOf((longValue2 * (j4 < 0 ? 0L : j4)) / 3600000), money.currency_code, 4);
                }
            }
        }
        return null;
    }

    @Override // retrofit2.Converter
    public Object convert(Object obj) {
        ResponseBody responseBody = (ResponseBody) obj;
        try {
            try {
                return (MessageLite) ((Parser) this.pool).parseFrom(responseBody.source().inputStream());
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException(e);
            }
        } finally {
            responseBody.close();
        }
    }

    public String getEncryptionSalt() {
        return ((SharedPreferences) ((Payload) this.pool).a).getString("encryptionSalt", null);
    }

    public String getEncryptionhmac() {
        return ((SharedPreferences) ((Payload) this.pool).a).getString("encryptionhmac", null);
    }

    public String getInstallationID() {
        String string2 = ((SharedPreferences) ((Payload) this.pool).a).getString("installationID", "");
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = ((SharedPreferences) ((Payload) this.pool).a).edit();
        edit.putString("installationID", uuid);
        SharedPreferencesCompat.apply(edit);
        return uuid;
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public ReadonlyStateFlow getLoading() {
        return (ReadonlyStateFlow) this.pool;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        ((CompletableFutureCallAdapterFactory.CallCancelCompletableFuture) this.pool).completeExceptionally(th);
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        boolean z = response.rawResponse.isSuccessful;
        CompletableFutureCallAdapterFactory.CallCancelCompletableFuture callCancelCompletableFuture = (CompletableFutureCallAdapterFactory.CallCancelCompletableFuture) this.pool;
        if (z) {
            callCancelCompletableFuture.complete(response.body);
        } else {
            callCancelCompletableFuture.completeExceptionally(new HttpException(response));
        }
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setAttribute(String str, String str2) {
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setNoParent() {
        this.pool = AutoValue_ImmutableSpanContext.INVALID;
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setParent(Context context) {
        if (context == null) {
            ApiUsageLogger.log();
            return this;
        }
        Span span = (Span) context.get();
        if (span == null) {
            span = PropagatedSpan.INVALID;
        }
        this.pool = span.getSpanContext();
        return this;
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public SpanBuilder setStartTimestamp(long j) {
        return this;
    }

    public void setXsdETag(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) ((Payload) this.pool).a).edit();
        edit.putString("xsdETag", str);
        SharedPreferencesCompat.apply(edit);
    }

    @Override // com.stripe.android.view.AuthActivityStarter
    public void start(Object obj) {
        Stripe3ds2TransactionContract.Args args = (Stripe3ds2TransactionContract.Args) obj;
        ActivityHost activityHost = (ActivityHost) this.pool;
        Bundle bundleOf = BundleKt.bundleOf(new Pair("extra_args", args));
        List list = StripePaymentController.EXPAND_PAYMENT_METHOD;
        activityHost.startActivityForResult(Stripe3ds2TransactionActivity.class, bundleOf, DatadogTracing.getRequestCode$payments_core_release(args.stripeIntent));
    }

    @Override // io.opentelemetry.api.trace.SpanBuilder
    public Span startSpan() {
        if (((SpanContext) this.pool) == null) {
            Context current = LazyStorage.storage.current();
            if (current == null) {
                current = ArrayBasedContext.ROOT;
            }
            Span span = (Span) current.get();
            if (span == null) {
                span = PropagatedSpan.INVALID;
            }
            this.pool = span.getSpanContext();
        }
        SpanContext spanContext = (SpanContext) this.pool;
        if (spanContext != null) {
            return new PropagatedSpan(spanContext);
        }
        ApiUsageLogger.log();
        return PropagatedSpan.INVALID;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitClassDescriptor(ClassDescriptor classDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        classDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderClass((DescriptorRendererImpl) this.pool, classDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitConstructorDescriptor(ConstructorDescriptor constructorDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        constructorDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderConstructor((DescriptorRendererImpl) this.pool, constructorDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitFunctionDescriptor(FunctionDescriptor functionDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        functionDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderFunction((DescriptorRendererImpl) this.pool, functionDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitModuleDeclaration(ModuleDescriptor moduleDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        moduleDescriptor.getClass();
        sb.getClass();
        ((DescriptorRendererImpl) this.pool).renderName(moduleDescriptor, sb, true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageFragmentDescriptor(PackageFragmentDescriptor packageFragmentDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        packageFragmentDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderPackageFragment((DescriptorRendererImpl) this.pool, packageFragmentDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPackageViewDescriptor(PackageViewDescriptor packageViewDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        packageViewDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderPackageView((DescriptorRendererImpl) this.pool, packageViewDescriptor, sb);
        return Unit.INSTANCE;
    }

    public void visitPropertyAccessorDescriptor(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb, String str) {
        DescriptorRendererImpl descriptorRendererImpl = (DescriptorRendererImpl) this.pool;
        int i = DescriptorRendererImpl$RenderDeclarationDescriptorVisitor$WhenMappings.$EnumSwitchMapping$0[descriptorRendererImpl.getPropertyAccessorRenderingPolicy().ordinal()];
        if (i == 1) {
            descriptorRendererImpl.renderMemberModifiers(propertyAccessorDescriptor, sb);
            sb.append(str.concat(" for "));
            PropertyDescriptor correspondingProperty = propertyAccessorDescriptor.getCorrespondingProperty();
            correspondingProperty.getClass();
            DescriptorRendererImpl.access$renderProperty(descriptorRendererImpl, correspondingProperty, sb);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        } else {
            propertyAccessorDescriptor.getClass();
            sb.getClass();
            DescriptorRendererImpl.access$renderFunction(descriptorRendererImpl, propertyAccessorDescriptor, sb);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyDescriptor(PropertyDescriptor propertyDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        propertyDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderProperty((DescriptorRendererImpl) this.pool, propertyDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertyGetterDescriptor(PropertyGetterDescriptor propertyGetterDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        propertyGetterDescriptor.getClass();
        sb.getClass();
        visitPropertyAccessorDescriptor(propertyGetterDescriptor, sb, "getter");
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitPropertySetterDescriptor(PropertySetterDescriptor propertySetterDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        propertySetterDescriptor.getClass();
        sb.getClass();
        visitPropertyAccessorDescriptor(propertySetterDescriptor, sb, "setter");
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitReceiverParameterDescriptor(ReceiverParameterDescriptor receiverParameterDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        receiverParameterDescriptor.getClass();
        sb.getClass();
        sb.append(receiverParameterDescriptor.getName());
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeAliasDescriptor(TypeAliasDescriptor typeAliasDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        typeAliasDescriptor.getClass();
        sb.getClass();
        DescriptorRendererImpl.access$renderTypeAlias((DescriptorRendererImpl) this.pool, typeAliasDescriptor, sb);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        typeParameterDescriptor.getClass();
        sb.getClass();
        ((DescriptorRendererImpl) this.pool).renderTypeParameter(typeParameterDescriptor, sb, true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    public Object visitValueParameterDescriptor(ValueParameterDescriptor valueParameterDescriptor, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        valueParameterDescriptor.getClass();
        sb.getClass();
        ((DescriptorRendererImpl) this.pool).renderValueParameter(valueParameterDescriptor, true, sb, true);
        return Unit.INSTANCE;
    }

    public /* synthetic */ Pool(Object obj) {
        this.pool = obj;
    }

    public Pool(AndroidWorkManager androidWorkManager) {
        androidWorkManager.getClass();
        this.pool = androidWorkManager;
    }
}
