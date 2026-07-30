package com.baidu.location.pb;

import com.github.mikephil.charting.utils.i;
import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;

/* loaded from: classes2.dex */
public final class BhpsPointFirst extends MessageMicro {
    public static final int ALTITUDE_FIELD_NUMBER = 12;
    public static final int DRIVER_STATE_FIELD_NUMBER = 9;
    public static final int GPS_ANGLE_FIELD_NUMBER = 4;
    public static final int GPS_SPEED_FIELD_NUMBER = 3;
    public static final int GPS_STAT_FIELD_NUMBER = 6;
    public static final int GPS_TIME_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 11;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LOCATION_RADIUS_FIELD_NUMBER = 10;
    public static final int LONGITUDE_FIELD_NUMBER = 1;
    public static final int TURN_DIR_FIELD_NUMBER = 7;
    public static final int TURN_DIST_FIELD_NUMBER = 8;
    public static final int WALKING_STATE_FIELD_NUMBER = 13;
    private boolean hasAltitude;
    private boolean hasDriverState;
    private boolean hasGpsAngle;
    private boolean hasGpsSpeed;
    private boolean hasGpsStat;
    private boolean hasGpsTime;
    private boolean hasHeight;
    private boolean hasLatitude;
    private boolean hasLocationRadius;
    private boolean hasLongitude;
    private boolean hasTurnDir;
    private boolean hasTurnDist;
    private boolean hasWalkingState;
    private String longitude_ = "";
    private String latitude_ = "";
    private double gpsSpeed_ = i.DOUBLE_EPSILON;
    private double gpsAngle_ = i.DOUBLE_EPSILON;
    private long gpsTime_ = 0;
    private int gpsStat_ = 0;
    private int turnDir_ = 0;
    private int turnDist_ = 0;
    private int driverState_ = 0;
    private int locationRadius_ = 0;
    private int height_ = 0;
    private int altitude_ = 0;
    private int walkingState_ = 0;
    private int cachedSize = -1;

    public static BhpsPointFirst parseFrom(CodedInputStreamMicro codedInputStreamMicro) {
        return new BhpsPointFirst().mergeFrom(codedInputStreamMicro);
    }

    public final BhpsPointFirst clear() {
        clearLongitude();
        clearLatitude();
        clearGpsSpeed();
        clearGpsAngle();
        clearGpsTime();
        clearGpsStat();
        clearTurnDir();
        clearTurnDist();
        clearDriverState();
        clearLocationRadius();
        clearHeight();
        clearAltitude();
        clearWalkingState();
        this.cachedSize = -1;
        return this;
    }

    public BhpsPointFirst clearAltitude() {
        this.hasAltitude = false;
        this.altitude_ = 0;
        return this;
    }

    public BhpsPointFirst clearDriverState() {
        this.hasDriverState = false;
        this.driverState_ = 0;
        return this;
    }

    public BhpsPointFirst clearGpsAngle() {
        this.hasGpsAngle = false;
        this.gpsAngle_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointFirst clearGpsSpeed() {
        this.hasGpsSpeed = false;
        this.gpsSpeed_ = i.DOUBLE_EPSILON;
        return this;
    }

    public BhpsPointFirst clearGpsStat() {
        this.hasGpsStat = false;
        this.gpsStat_ = 0;
        return this;
    }

    public BhpsPointFirst clearGpsTime() {
        this.hasGpsTime = false;
        this.gpsTime_ = 0L;
        return this;
    }

    public BhpsPointFirst clearHeight() {
        this.hasHeight = false;
        this.height_ = 0;
        return this;
    }

    public BhpsPointFirst clearLatitude() {
        this.hasLatitude = false;
        this.latitude_ = "";
        return this;
    }

    public BhpsPointFirst clearLocationRadius() {
        this.hasLocationRadius = false;
        this.locationRadius_ = 0;
        return this;
    }

    public BhpsPointFirst clearLongitude() {
        this.hasLongitude = false;
        this.longitude_ = "";
        return this;
    }

    public BhpsPointFirst clearTurnDir() {
        this.hasTurnDir = false;
        this.turnDir_ = 0;
        return this;
    }

    public BhpsPointFirst clearTurnDist() {
        this.hasTurnDist = false;
        this.turnDist_ = 0;
        return this;
    }

    public BhpsPointFirst clearWalkingState() {
        this.hasWalkingState = false;
        this.walkingState_ = 0;
        return this;
    }

    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getDriverState() {
        return this.driverState_;
    }

    public double getGpsAngle() {
        return this.gpsAngle_;
    }

    public double getGpsSpeed() {
        return this.gpsSpeed_;
    }

    public int getGpsStat() {
        return this.gpsStat_;
    }

    public long getGpsTime() {
        return this.gpsTime_;
    }

    public int getHeight() {
        return this.height_;
    }

    public String getLatitude() {
        return this.latitude_;
    }

    public int getLocationRadius() {
        return this.locationRadius_;
    }

    public String getLongitude() {
        return this.longitude_;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public int getSerializedSize() {
        int computeStringSize = hasLongitude() ? CodedOutputStreamMicro.computeStringSize(1, getLongitude()) : 0;
        if (hasLatitude()) {
            computeStringSize += CodedOutputStreamMicro.computeStringSize(2, getLatitude());
        }
        if (hasGpsSpeed()) {
            computeStringSize += CodedOutputStreamMicro.computeDoubleSize(3, getGpsSpeed());
        }
        if (hasGpsAngle()) {
            computeStringSize += CodedOutputStreamMicro.computeDoubleSize(4, getGpsAngle());
        }
        if (hasGpsTime()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt64Size(5, getGpsTime());
        }
        if (hasGpsStat()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(6, getGpsStat());
        }
        if (hasTurnDir()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(7, getTurnDir());
        }
        if (hasTurnDist()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(8, getTurnDist());
        }
        if (hasDriverState()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(9, getDriverState());
        }
        if (hasLocationRadius()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(10, getLocationRadius());
        }
        if (hasHeight()) {
            computeStringSize += CodedOutputStreamMicro.computeUInt32Size(11, getHeight());
        }
        if (hasAltitude()) {
            computeStringSize += CodedOutputStreamMicro.computeInt32Size(12, getAltitude());
        }
        if (hasWalkingState()) {
            computeStringSize += CodedOutputStreamMicro.computeInt32Size(13, getWalkingState());
        }
        this.cachedSize = computeStringSize;
        return computeStringSize;
    }

    public int getTurnDir() {
        return this.turnDir_;
    }

    public int getTurnDist() {
        return this.turnDist_;
    }

    public int getWalkingState() {
        return this.walkingState_;
    }

    public boolean hasAltitude() {
        return this.hasAltitude;
    }

    public boolean hasDriverState() {
        return this.hasDriverState;
    }

    public boolean hasGpsAngle() {
        return this.hasGpsAngle;
    }

    public boolean hasGpsSpeed() {
        return this.hasGpsSpeed;
    }

    public boolean hasGpsStat() {
        return this.hasGpsStat;
    }

    public boolean hasGpsTime() {
        return this.hasGpsTime;
    }

    public boolean hasHeight() {
        return this.hasHeight;
    }

    public boolean hasLatitude() {
        return this.hasLatitude;
    }

    public boolean hasLocationRadius() {
        return this.hasLocationRadius;
    }

    public boolean hasLongitude() {
        return this.hasLongitude;
    }

    public boolean hasTurnDir() {
        return this.hasTurnDir;
    }

    public boolean hasTurnDist() {
        return this.hasTurnDist;
    }

    public boolean hasWalkingState() {
        return this.hasWalkingState;
    }

    public final boolean isInitialized() {
        return this.hasLongitude && this.hasLatitude && this.hasGpsTime && this.hasGpsStat && this.hasHeight;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public BhpsPointFirst mergeFrom(CodedInputStreamMicro codedInputStreamMicro) {
        while (true) {
            int readTag = codedInputStreamMicro.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    setLongitude(codedInputStreamMicro.readString());
                    break;
                case 18:
                    setLatitude(codedInputStreamMicro.readString());
                    break;
                case 25:
                    setGpsSpeed(codedInputStreamMicro.readDouble());
                    break;
                case 33:
                    setGpsAngle(codedInputStreamMicro.readDouble());
                    break;
                case 40:
                    setGpsTime(codedInputStreamMicro.readUInt64());
                    break;
                case 48:
                    setGpsStat(codedInputStreamMicro.readUInt32());
                    break;
                case 56:
                    setTurnDir(codedInputStreamMicro.readUInt32());
                    break;
                case 64:
                    setTurnDist(codedInputStreamMicro.readUInt32());
                    break;
                case 72:
                    setDriverState(codedInputStreamMicro.readUInt32());
                    break;
                case 80:
                    setLocationRadius(codedInputStreamMicro.readUInt32());
                    break;
                case 88:
                    setHeight(codedInputStreamMicro.readUInt32());
                    break;
                case 96:
                    setAltitude(codedInputStreamMicro.readInt32());
                    break;
                case 104:
                    setWalkingState(codedInputStreamMicro.readInt32());
                    break;
                default:
                    if (!parseUnknownField(codedInputStreamMicro, readTag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public BhpsPointFirst setAltitude(int i8) {
        this.hasAltitude = true;
        this.altitude_ = i8;
        return this;
    }

    public BhpsPointFirst setDriverState(int i8) {
        this.hasDriverState = true;
        this.driverState_ = i8;
        return this;
    }

    public BhpsPointFirst setGpsAngle(double d8) {
        this.hasGpsAngle = true;
        this.gpsAngle_ = d8;
        return this;
    }

    public BhpsPointFirst setGpsSpeed(double d8) {
        this.hasGpsSpeed = true;
        this.gpsSpeed_ = d8;
        return this;
    }

    public BhpsPointFirst setGpsStat(int i8) {
        this.hasGpsStat = true;
        this.gpsStat_ = i8;
        return this;
    }

    public BhpsPointFirst setGpsTime(long j8) {
        this.hasGpsTime = true;
        this.gpsTime_ = j8;
        return this;
    }

    public BhpsPointFirst setHeight(int i8) {
        this.hasHeight = true;
        this.height_ = i8;
        return this;
    }

    public BhpsPointFirst setLatitude(String str) {
        this.hasLatitude = true;
        this.latitude_ = str;
        return this;
    }

    public BhpsPointFirst setLocationRadius(int i8) {
        this.hasLocationRadius = true;
        this.locationRadius_ = i8;
        return this;
    }

    public BhpsPointFirst setLongitude(String str) {
        this.hasLongitude = true;
        this.longitude_ = str;
        return this;
    }

    public BhpsPointFirst setTurnDir(int i8) {
        this.hasTurnDir = true;
        this.turnDir_ = i8;
        return this;
    }

    public BhpsPointFirst setTurnDist(int i8) {
        this.hasTurnDist = true;
        this.turnDist_ = i8;
        return this;
    }

    public BhpsPointFirst setWalkingState(int i8) {
        this.hasWalkingState = true;
        this.walkingState_ = i8;
        return this;
    }

    @Override // com.google.protobuf.micro.MessageMicro
    public void writeTo(CodedOutputStreamMicro codedOutputStreamMicro) {
        if (hasLongitude()) {
            codedOutputStreamMicro.writeString(1, getLongitude());
        }
        if (hasLatitude()) {
            codedOutputStreamMicro.writeString(2, getLatitude());
        }
        if (hasGpsSpeed()) {
            codedOutputStreamMicro.writeDouble(3, getGpsSpeed());
        }
        if (hasGpsAngle()) {
            codedOutputStreamMicro.writeDouble(4, getGpsAngle());
        }
        if (hasGpsTime()) {
            codedOutputStreamMicro.writeUInt64(5, getGpsTime());
        }
        if (hasGpsStat()) {
            codedOutputStreamMicro.writeUInt32(6, getGpsStat());
        }
        if (hasTurnDir()) {
            codedOutputStreamMicro.writeUInt32(7, getTurnDir());
        }
        if (hasTurnDist()) {
            codedOutputStreamMicro.writeUInt32(8, getTurnDist());
        }
        if (hasDriverState()) {
            codedOutputStreamMicro.writeUInt32(9, getDriverState());
        }
        if (hasLocationRadius()) {
            codedOutputStreamMicro.writeUInt32(10, getLocationRadius());
        }
        if (hasHeight()) {
            codedOutputStreamMicro.writeUInt32(11, getHeight());
        }
        if (hasAltitude()) {
            codedOutputStreamMicro.writeInt32(12, getAltitude());
        }
        if (hasWalkingState()) {
            codedOutputStreamMicro.writeInt32(13, getWalkingState());
        }
    }

    public static BhpsPointFirst parseFrom(byte[] bArr) {
        return (BhpsPointFirst) new BhpsPointFirst().mergeFrom(bArr);
    }
}
