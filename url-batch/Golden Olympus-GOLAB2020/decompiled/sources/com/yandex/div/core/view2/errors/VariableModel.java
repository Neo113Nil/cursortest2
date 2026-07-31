package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class VariableModel {

    @NotNull
    private final String name;

    @NotNull
    private final String path;

    @NotNull
    private final String type;

    @NotNull
    private final String value;

    public VariableModel(@NotNull String name, @NotNull String path, @NotNull String type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = name;
        this.path = path;
        this.type = type;
        this.value = value;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariableModel)) {
            return false;
        }
        VariableModel variableModel = (VariableModel) obj;
        return Intrinsics.areEqual(this.name, variableModel.name) && Intrinsics.areEqual(this.path, variableModel.path) && Intrinsics.areEqual(this.type, variableModel.type) && Intrinsics.areEqual(this.value, variableModel.value);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    @NotNull
    public String toString() {
        return "VariableModel(name=" + this.name + ", path=" + this.path + ", type=" + this.type + ", value=" + this.value + ')';
    }
}
