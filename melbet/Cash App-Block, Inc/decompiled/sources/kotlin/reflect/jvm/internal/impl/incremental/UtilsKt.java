package kotlin.reflect.jvm.internal.impl.incremental;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LocationInfo;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes9.dex */
public final class UtilsKt {
    public static final void record(LookupTracker lookupTracker, LookupLocation lookupLocation, ClassDescriptor classDescriptor, Name name) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        classDescriptor.getClass();
        name.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        Position position = lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION();
        String filePath = location.getFilePath();
        String asString = DescriptorUtils.getFqName(classDescriptor).asString();
        ScopeKind scopeKind = ScopeKind.CLASSIFIER;
        String asString2 = name.asString();
        asString2.getClass();
        lookupTracker.record(filePath, position, asString, scopeKind, asString2);
    }

    public static final void recordPackageLookup(LookupTracker lookupTracker, LookupLocation lookupLocation, String str, String str2) {
        LocationInfo location;
        lookupTracker.getClass();
        lookupLocation.getClass();
        str.getClass();
        str2.getClass();
        if (lookupTracker == LookupTracker.DO_NOTHING.INSTANCE || (location = lookupLocation.getLocation()) == null) {
            return;
        }
        lookupTracker.record(location.getFilePath(), lookupTracker.getRequiresPosition() ? location.getPosition() : Position.Companion.getNO_POSITION(), str, ScopeKind.PACKAGE, str2);
    }

    public static final void record(LookupTracker lookupTracker, LookupLocation lookupLocation, PackageFragmentDescriptor packageFragmentDescriptor, Name name) {
        lookupTracker.getClass();
        lookupLocation.getClass();
        packageFragmentDescriptor.getClass();
        name.getClass();
        String asString = packageFragmentDescriptor.getFqName().asString();
        String asString2 = name.asString();
        asString2.getClass();
        recordPackageLookup(lookupTracker, lookupLocation, asString, asString2);
    }
}
